package com.alby.dp.state.example6;

/**
 * Created by xianwei on 2015/12/14.
 * 处理项目经理的审核，处理后可能对应部门经理审核、审核结束之中的一种
 */
public class ProjectManagerState implements LeaveRequesState{
    @Override
    public void doWork(StateMachine request) {
        //先把业务对象造型回来
        LeaveRequestModel lrm = (LeaveRequestModel) request.getBusinessVO();

        //业务处理，把审核结果保存到数据库中

        //根据选择的结果和条件来设置下一步

        if ("同意".equals(lrm.getResult())){
            if (lrm.getLeaveDays()>3){
                //如果大于3天，提交部门经理
                request.setState(new DepManagerState());

                //为部门经理增加一个公国
            }else {
                //项目经理不同意的话，也就不用提交给部门经理了，转向审核结束状态
                request.setState(new AuditOverState());

                //给申请人增加一个工作，让他查看审核结果
            }
        }else {
            //项目经理不同意的话，也就不用提交给部门经理了，转向审核结束状态
            request.setState(new AuditOverState());

            //给申请人增加一个工作，让他查看审核结果
        }

    }
}

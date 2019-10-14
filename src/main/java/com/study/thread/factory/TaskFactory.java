package com.study.thread.factory;

import com.study.thread.constants.JobTypeConstants;
import com.study.thread.task.DemoOneTask;
import com.study.thread.task.DemoTwoTask;
import com.study.thread.task.Task;

/**
 * @Description: 任务工厂
 * @Author: weiyan
 * @CreateDate: 2019/10/14
 */
public class TaskFactory {

    public static Task getTask(JobTypeConstants jobType) {
        Task task = null;
        switch (jobType) {
            case DEMO_ONE:
                task = new DemoOneTask();
                break;
            case DEMO_TWO:
                task = new DemoTwoTask();
                break;
            default:
                break;

        }
        return task;
    }
}

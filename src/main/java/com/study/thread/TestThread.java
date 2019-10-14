package com.study.thread;

import com.study.thread.constants.JobTypeConstants;
import com.study.thread.factory.TaskFactory;
import com.study.thread.manager.ExecutorManager;
import com.study.thread.task.Task;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/**
 * @Description: java类作用描述
 * @Author: weiyan
 * @CreateDate: 2019/10/14
 */
public class TestThread {
    private static ExecutorManager executorManager = ExecutorManager.getInstance();
    public static void main(String[] args) {
        ExecutorService executorService = executorManager.initTheadPool("BdssMessage");
        Task demoOneTask = TaskFactory.getTask(JobTypeConstants.DEMO_ONE);
        Task demoTwoTask = TaskFactory.getTask(JobTypeConstants.DEMO_TWO);
        Future<Object> f1 = executorService.submit(demoOneTask);
        Future<Object> f2 = executorService.submit(demoTwoTask);

        try {
            Object o1 = f1.get();
            Object o2 = f2.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } finally {
            executorManager.closeExecutorService(executorService);
        }
    }
}

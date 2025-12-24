// package com.example.demo.listener;

// import org.testng.ITestListener;
// import org.testng.ITestResult;
// import org.testng.ITestContext;

// public class TestResultListener implements ITestListener {

//     @Override
//     public void onTestSuccess(ITestResult result) {
//         System.out.println("TEST PASSED: " + result.getName());
//     }

//     @Override
//     public void onTestFailure(ITestResult result) {
//         System.out.println("TEST FAILED: " + result.getName());
//     }

//     @Override
//     public void onTestSkipped(ITestResult result) {
//         System.out.println("TEST SKIPPED: " + result.getName());
//     }

//     @Override
//     public void onStart(ITestContext context) {
//         System.out.println("TEST STARTED: " + context.getName());
//     }

//     @Override
//     public void onFinish(ITestContext context) {
//         System.out.println("TEST FINISHED: " + context.getName());
//     }
// }

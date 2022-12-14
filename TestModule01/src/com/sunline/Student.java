package com.sunline;

/**
 * @author: zxy
 * @date: 2022/11/6 - 18:03
 * @description: com.sunline
 * @version: 1.0
 */

/*
*1.  idea集成git操作
*   1. 创建project
*   2. settings - version control - 添加git bin 下 git.exe
*   3. 初始化项目目录 作为本地仓库 VCS - IMPORT INTO VERSION - CREATE git...
*   4. 创建模块-类 右键-git - add 提交到暂存区 - commit - 本地库
*       console：git 控制台输出
*       log：相当于git log
*2. 与远程库关联
*   pull: git pull 远程库地址 分支 --allow-unrelated-histories
*   push: git push -u 远程库地址 分支 -f
* */
public class Student {
    private String name;
    private int age;
    private double height;
    private double score;
    private String cname;
}

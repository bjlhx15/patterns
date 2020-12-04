package com.github.bjlhx15.patterns.base.eg02structure.eg06composite;

import java.util.List;

/*
 * 文件节点抽象(是文件和目录的父类)
 */
public interface IFile {

    //显示文件或者文件夹的名称
    void display();

    //添加
    boolean add(IFile file);

    //移除
    boolean remove(IFile file);

    //获得子节点
    List<IFile> getChild();
}

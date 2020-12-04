package com.github.bjlhx15.patterns.base.eg02structure.eg06composite;

import org.junit.Test;

import java.util.List;

public class IFileTest {
@Test
    public void test(){
    //C盘
    Folder rootFolder = new Folder("C:");
    //C盘下的目录一
    Folder folder1 = new Folder("目录一");
    //C盘下的文件一
    File file1 = new File("文件一.txt");

    rootFolder.add(folder1);
    rootFolder.add(file1);

    //目录一下的目录二
    Folder folder2 = new Folder("目录二");
    //目录一下的文件二
    File file2 = new File("文件二.txt");
    folder1.add(folder2);
    folder1.add(file2);

    //目录二下的目录三
    Folder folder3 = new Folder("目录三");
    //目录二下的文件三
    File file3 = new File("文件三.txt");
    folder2.add(folder3);
    folder2.add(file3);

    displayTree(rootFolder,0);

}

    public static void displayTree(IFile rootFolder, int deep) {
        for(int i = 0; i < deep; i++) {
            System.out.print("--");
        }
        //显示自身的名称
        rootFolder.display();
        //获得子树
        List<IFile> children = rootFolder.getChild();
        //遍历子树
        for(IFile file : children) {
            if(file instanceof File) {
                for(int i = 0; i <= deep; i++) {
                    System.out.print("--");
                }
                file.display();
            }else {
                displayTree(file,deep + 1);
            }
        }
    }
}
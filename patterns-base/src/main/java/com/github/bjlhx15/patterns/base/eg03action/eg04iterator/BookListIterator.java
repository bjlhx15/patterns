package com.github.bjlhx15.patterns.base.eg03action.eg04iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookListIterator {
    //容器内部还是一个List，也可以用数组
    private List<Book> bookList = new ArrayList<Book>();
    private int index;

    //添加书籍
    public void addBook(Book book){
        bookList.add(book);
    }

    //删除书籍
    public void removeBook(Book book){
        int bookIndex = bookList.indexOf(book);
        bookList.remove(bookIndex);
    }

    //获取集合长度
    public int getSize(){
        return bookList.size();
    }

    //根据index获取Book
    public Book getByIndex(int index){
        return bookList.get(index);
    }

    //得到Iterator实例
    public Iterator Iterator() {
        return new Itr();
    }

    //内部类，Iterator实例（因为要使用容器的内部信息，所以要写成内部类）
    private class Itr implements Iterator{
        //判断是否有下一本书,将刚才hasNext()中内容复制过来即可
        public boolean hasNext() {
            if(index >= bookList.size()){
                return false;
            }
            return true;
        }
        //获得下一本书,将刚才getNext()中内容复制过来即可
        public Object next() {
            return bookList.get(index++);
        }

        public void remove() {

        }
    }
}
package com.sterbensq.myblog.test;

import org.omg.CORBA.SystemException;
import org.omg.CORBA.portable.InputStream;
import org.omg.CORBA.portable.InvokeHandler;
import org.omg.CORBA.portable.OutputStream;
import org.omg.CORBA.portable.ResponseHandler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test01 extends Object {
    @Override
    public String toString(){
        return super.toString();
    }

    @Deprecated
    public static void Test(){
        System.out.println("alalalal");
    }

    @SuppressWarnings("all")
    public void test2(){
        List list=new ArrayList();
    }

    public static void main(String[] args) {
    }

    //反转字符串
    public char[] reverseString(char[] str){
        if(str==null){
            return null;
        }
        int length=str.length;
        char[] result=new char[length];
        for (int i = 0; i < length/2; i++) {
            char temp=str[i];
            str[i]=str[length-i-1];
            str[length-i-1]=temp;
        }
        return result;
    }

    public int getNums(String str){
        //结果
        int result=0;
        //栈指针
        int pop=-1;
        //初始化栈
        char[] stack=new char[str.length()];
        //获取字符串的char数组
        char[] source=str.toCharArray();
        for(int i=0;i<str.length();i++){
            if(source[i]=='('){
                stack[++pop]=source[i];
            }else if(pop>=0&&source[i]==')'&&stack[pop]=='('){
                result=result+2;
                pop--;
            }
        }
        return result;
    }

    public int getMaxPrice(int[] price){
        //暴力破解
        int length=price.length;
        int max=0;
        for(int i=0;i<length;i++){
            for(int j=i+1;j<length;j++){
                int temp=price[j]-price[i];
                if(temp>max){
                    max=temp;
                }
            }
        }
        return max;
    }

    public int[] dailyTemperatures(int[] temperatures) {
        int[] stack=new int[temperatures.length];
        int pop=-1;
        int[] result=new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){
            while(pop>=0&&temperatures[i]>temperatures[stack[pop]]) {
                result[stack[pop]] = i - stack[pop];
                pop--;
            }

            stack[++pop]=i;
        }
        return result;
    }
    //分
    public static void guibing_sort(int[] a,int low,int high){
        if(low>=high){
            return ;
        }
        int mid=low+(high-low)/2;
        guibing_sort(a,low,mid);
        guibing_sort(a,mid+1,high);
        merge(a,low,mid,high);

    }
    public static void merge(int[] a,int low,int mid,int high){
        int[] copy=a.clone();
        //左半边起始位置
        int i=low;
        //右半边起始位置
        int j=mid+1;
        //表示从何位置开始修改原来的数组
        int k=low;
        while(k<=high){
            if(i>mid){
                a[k++]=copy[j++];
            }else if(j>high){
                a[k++]=copy[i++];
            }else if(copy[j]<copy[i]){
                a[k++]=copy[j++];
            }else{
                a[k++]=copy[i++];
            }
        }
    }
}

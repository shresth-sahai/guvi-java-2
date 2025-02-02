//package org.example;
//
//import java.util.Scanner;
//
//public class Arrays {
//    // array is data structure -> fixed size elements are of same type
////    int [] arr={1,2,3,4,5};
////    int[][] matrix={{1,2,3},{4,5,6}};// 2 d array
////    /*
////
////    1,2,3,4,5
////    0 1 2 4 5
////    arr[0] -> 1
////    arr[1] = 2
//    // 1 2 3
//    // 4 5 6
////
////
////     */
////    // jagged array -> each row has diff no of cols
////    int[][] matrix1={{1,2,},{4,5,6},{7}};
////    int [] arr1;
////    arr1=new int[5];
////    arr1[0]=12;
////    arr1[1]=13;
////
////
////    int [][] m=new int[3][3];
////    m[0][0]=1;
////
////    int [][] j =new int[3][];
////
////    j[0]=new int[2];
////    j[1]=new int[4];
//
//
//    // p1 -> [1,2,3] -> index =1  , new value -> user
//// [1,newValue,2,3] -> print
//
////    Scanner scanner=new Scanner(System.in);
////    int size=scanner.nextInt();
////    int[] arr=new int[size];
////    for(int i=0;i<size;i++){
////        arr[i]=scanner.nextInt();
////    }
////    int index=scanner.nextInt();
////
////    if(index<0 && index>size){
////        return;
////    }
////    int newValue=scanner.nextInt();
////    int newArr[]=new int[size+1];
////    /* [1,2,3] , 5
////    index = 1 i=0
////              [ 1  5 2 3  ]
////     */
////
////
////    for(int i=0;i<index;i++){
////        newArr[i]=arr[i];
////    }
////    newArr[index]=newValue;
////
////    for(int i=index;i<size;i++){
////        newArr[i+1]=arr[i];
////    }
////
////scanner.close();
//
//    //Reverse an Array [1,2,3]  [3,2,1]
//
////    int a[]={1,2,3};
////    int []b=new int[3];
////    for(int i=3;i>=0;i--){
////        b
////    }
//    // 1 2 3
//    // 0 1 2    arr[0]=1 arr[1] =2 arr[2] =3
//    // 3 2 1
//int a[]={1,2,3};
////for(int i=a.length-1;i>=0;i--){
////    print(a[i]);
////    }
//    // min /max
////int[] arr = {4, 2, 1, 2, 4, 3, 3};
//// -> output array without duplicates -> 4 2 1 3 -> 1 2 3 4
//    // nested loops -> inner loop will execute fully
////Scanner scanner=new Scanner(System.in);
////int size= scanner.nextInt();
////int [] arr=new int[size];
////for(int i=0;i<size;i++){
////    arr[i]=scanner.nextInt();
////    }
////int [] temp=new int[size];
////int newSize=0;
////
////for(int i=0;i<size;i++){
////    boolean isDuplicate=false;
////
////    for(int j=0;j<newSize;j++){
//
////        if(arr[i]==temp[j]){
////            isDuplicate=true;
////            break;
////        }
////    }
////    if(!isDuplicate){
////        temp[newSize]=arr[i];
////        newSize++;
////    }
////    for(int i=0;i<newSize;i++){
////        print(temp[i])
////    }
//    }
//// [1,4,5] [2,3]    -> [1,2,3,4,5] , temp
//    //delete
//// int[] a={1,2,3}; -> [1,3]
////int index=1;
////for(int i=index;i<3;i++){
////    a[i]=a[i+1];
////}
////a[2]=0; // clear the element
//
//// merge arrays 3 ,3
//int[] m =new int[6];
//int []a;
//int[]b;
//int i=0,j=0,k=0;
//// 1 2 4 , 3 -> 1 2 34
//
//while(i<3 && j<3){
//    if(a[i]<=b[j]){
//        m[k]=a[i];
//        i++;
//        k++;
//        }
//    else {
//        m[k]=b[j];
//        j++; k++;
//        }
//        }
//while(i<3){
//    m[k]=a[i];i++;k++;
//        }
//        while(j<3){
//        m[k]=b[j];j++;k++;
//        }
//

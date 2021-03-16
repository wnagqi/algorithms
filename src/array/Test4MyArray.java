package array;

import util.MyArray;

public class Test4MyArray {
    public static void main(String[] args) {
        // 创建数组
        MyArray myArray = new MyArray();
        myArray.add(22);
        myArray.add(33);
        myArray.add(44);
        myArray.delete(2);
        myArray.add(55);
        myArray.insert(2,100); // [22,100,33,55]
        myArray.show();
        myArray.size();
        System.out.println(myArray.get(1));
        System.out.println(myArray.binarySearch(33));
        System.out.println(myArray.lineSearch(100));

    }
}

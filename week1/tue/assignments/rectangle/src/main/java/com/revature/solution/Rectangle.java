package com.revature.solution;

public class Rectangle {
    private String mName;
    private int mLength;
    private int mWidth;

    Rectangle(String s, int l, int w) {
        mName = s; mLength = l; mWidth = w;
    }

    public String getName() { return mName; }
    public void setName(String s) { mName = s; }
    public int getLength() { return mLength; }
    public void setLength(int i) { mLength = i; }
    public int getWidth() { return mWidth; }
    public void setWidth(int i) { mWidth = i; }

    public int area() { return mLength * mWidth; }
    public int perimeter() { return 2 * (mLength + mWidth); }

    @Override
    public String toString() {
        return String.format(
                "Rectangle %s\tLength: %d\tWidth: %d\tArea: %d\tPerimeter: %d",
                mName, mLength, mWidth, area(), perimeter());
    }
}

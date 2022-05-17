package com.revature.rectang;

public class Comparation {


        public boolean isLessThan(Rectangle a, Rectangle b){
            if ( a.getArea() >= b.getArea()) {
                return true;
            }
            else return false;
        }

        public boolean perimIsLessThan(Rectangle a, Rectangle b){
            if( a.getPerimeter() >= b.getPerimeter()){
                return true;
            }
            else return false;
        }



    }




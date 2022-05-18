package  com.revature.rectangle;

public class Perimeter {

        public boolean isLessThan(Rec a, Rec b) {
            if(a.perimeter() < b.perimeter()) {
                return true;
            }
            return false;
        }

    }


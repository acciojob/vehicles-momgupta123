//package com.driver;
//
//public class F1 extends Car {
//
//    public F1(String name, boolean isManual) {
//        //Use arbitrary values for parameters which are not mentioned
//    }
//
//    public void accelerate(int rate){
//        int newSpeed = 0; //set the value of new speed by using currentSpeed and rate
//        /**
//         * speed 0: gear 1
//         * speed 1-50: gear 1
//         * speed 51-100: gear 2
//         * speed 101-150: gear 3
//         * speed 151-200: gear 4
//         * speed 201-250: gear 5
//         * speed more than 250: gear 6
//         */
//
//        if(newSpeed == 0) {
//            //Stop the car, set gear as 1
//        }
//        //for all other cases, change the gear accordingly
//
//        if(newSpeed > 0) {
//            changeSpeed(newSpeed, getCurrentDirection());
//        }
//    }
//}
package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        super(name, 4, 2, 7, isManual, "Race Car", 1);
    }

    public void accelerate(int rate){
        int newSpeed = super.getCurrentSpeed() + rate;
        int newGear;

        if(newSpeed == 0) {
            stop();
            newGear = 1;
        } else if (newSpeed >= 1 && newSpeed <= 50) {
            newGear = 1;
        } else if (newSpeed >= 51 && newSpeed <= 100) {
            newGear = 2;
        } else if (newSpeed >= 101 && newSpeed <= 150) {
            newGear = 3;
        } else if (newSpeed >= 151 && newSpeed <= 200) {
            newGear = 4;
        } else if (newSpeed >= 201 && newSpeed <= 250) {
            newGear = 5;
        } else {
            newGear = 6;
        }

        changeGear(newGear);
        changeSpeed(newSpeed, getCurrentDirection());
    }
}


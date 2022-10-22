public class Task_1 implements Task_1_base {
    @Override
    public int subtask_1_if(int first, int second, int third) {
        int smallest;
        if (first <= second && first <= third) {
            smallest = first;
        } else if (second <= third && second <= first) {
            smallest = second;
        } else {
            smallest = third;
        }
        return smallest;
    }
    /* (non-Javadoc)
     * @see Task_1_base#subtask_2_if(int)
     */
    @Override
    public boolean subtask_2_if(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
    /* (non-Javadoc)
     * @see Task_1_base#subtask_3_if(double, double, double, double, double, double)
     */
    
    @Override
    public int subtask_3_if(double x, double y, double left_up_x, double left_up_y, double width, double height) {
        double up_side = left_up_x+width, left_side = left_up_y-height;
        if(width == height)
            if((up_side - x <= 0.000001 || x-left_up_x <= 0.000001) || (left_up_y-y <= 0.000001 || y-left_side <= 0.000001))
                return 0;
            
            else 
                if(x > left_up_x && x < up_side && y < left_up_y && y > left_side) 
                    return 1;
                
                else 
                    return 0;
                
        else 
            return 2;
        
    }
    /* (non-Javadoc)
     * @see Task_1_base#subtask_4_if(double, double, double, double)
     */
    @Override
    public int subtask_4_if(double x0, double y0, double k, double b) {
        double y = (k * x0) + b;
        if (y0 > y && y0 - y >= 0.000001 ){
            return 0;
        }
        else if(y0 < y && y - y0 >= 0.000001 ) {
            return 1;
        }
        else {
            return 2;
        }
    }
    /* (non-Javadoc)
     * @see Task_1_base#subtask_5_switch(int)
     */
    @Override
    public String subtask_5_switch(int day_od_week) {
        if (day_od_week == 1)
        {
            return("Понедельник");
        }
        else if(day_od_week == 2)
        {
            return("Вторник");
        }
        else if(day_od_week == 3)
        {
            return("Среда");
        }
        else if(day_od_week == 4)
        {
            return("Четверг");
        }
        else if(day_od_week == 5)
        {
            return("Пятница");
        }
        else if(day_od_week == 6)
        {
            return("Суббота");
        }
        else if(day_od_week == 7)
        {
            return("Воскресенье");
        }
        else
        {
            return("Ошибка");
        }
    }
    @Override
    public String subtask_6_switch(int direction) {
        if (direction == 1)
        {
            return("север");
        }
        else if(direction == 2)
        {
            return("юг");
        }
        else if(direction == 3)
        {
            return("запад");
        }
        else if(direction == 4)
        {
            return("восток");
        }
        else
        {
            return("");
        }
    }
    /* (non-Javadoc)
     * @see Task_1_base#subtask_7_if(double, double, double, double, double, double)
     */
    @Override
    public int subtask_7_if(double vx, double vy, double vz, double speed, double time, double wall) {
        double distance = Math.sqrt(wall*wall*Math.abs(vx) + wall*wall*Math.abs(vy) + wall*wall*Math.abs(vz));
        if (time > 0 && speed > 0){
            if((distance/speed <= time && vx != 0) || Math.abs(distance/speed - time) <= 0.000001){
                return 1;
            }
            else {
                return 0;
            }
        }
        else {
            return 2;
        }
    }
    @Override
    public int subtask_8_if(double k1, double b1, double k2, double b2) {
        if ((k1 == k2) && (Math.abs(k1-k2) <= 0.000001) ){
            if (b1 != b2)
            {
                return 1;
            }
            else {
                return 3;
            }
        }
        else {
            return 2;
        }
        }
    }
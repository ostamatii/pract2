import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Katja
 */
public class ZodiacModel {
    
    private static HashMap<Integer,Integer> dates;    
    
    public ZodiacModel(){
        if (dates ==null){
            dates = new HashMap<Integer,Integer>();
            dates.put(1, 31);
            dates.put(2, 29);
            dates.put(3, 31);
            dates.put(4, 30);
            dates.put(5, 31);
            dates.put(6, 30);
            dates.put(7, 31);
            dates.put(8, 31);
            dates.put(9, 30);
            dates.put(10, 31);
            dates.put(11, 30);
            dates.put(12, 31);
        }  
    }
    
    public String getSign(int m,int d){
        String sign= "";
        switch(m){
            case 1: { if (d<=20) sign = "Козеріг";
                        else sign = "Водолій";
                        break;
                    }
            case 2: { if (d<=20) sign = "Водолій";
                        else sign = "Риби" ;
                        break;
                    }
            case 3: { if (d<=20) sign = "Риби";
                        else sign = "Овен";
                        break;
                    }
            case 4: { if (d<=20) sign = "Овен";
                        else sign = "Телець";
                        break;
                    }
            case 5: { if (d<=20) sign = "Телець";
                        else sign = "Близнюки";
                        break;
                    }
            case 6: { if (d<=21) sign = "Близнюки";
                        else sign = "Рак";
                        break;
                    }
            case 7: { if (d<=22) sign = "Рак";
                        else sign = "Лев";
                        break;
                    }
            case 8: { if (d<=23) sign = "Лев";
                        else sign = "Діва";
                        break;
                    }
            case 9: { if (d<=23) sign = "Діва";
                        else sign = "Терези";
                        break;
                    }
            case 10: { if (d<=23) sign = "Терези";
                        else sign = "Скорпіон";
                        break;
                    }
            case 11: { if (d<=22) sign = "Скорпіон";
                        else sign = "Стрілець";
                        break;
                    }
            case 12: { if (d<=21) sign = "Стрілець";
                        else sign = "Козеріг";
                        break;
                    }
        }
        return sign;
    }
    
    public boolean checkDate(int m, int d){
        if (d<=dates.get(m)) return true;
        else return false;
    }
}

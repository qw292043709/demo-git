import java.util.HashMap;
import java.util.Map;

public class Test1 {

    public static void main(String[] args){
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        map.put("d",4);
        map.put("a",5);
        map.put("f",7);
        for (int i=0;i<5;i++){
            if(i==4){
                System.out.println("测试循环！");
                break;
            }
        }

        String b = null ;
        System.out.println(b.length());

        ///这是分支提交的代码
        //测试拉取git上的项目

    }

}

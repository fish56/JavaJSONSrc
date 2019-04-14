package fastjson;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import entity.Monkey;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToJSONTest {
    @Test
    public void fromObject(){
        System.out.println(JSONObject.toJSONString(Monkey.getMonkey()));
        // {"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"}
    }
    @Test
    public void fromMap(){
        Map<String, String> map = new HashMap<String, String>();
        map.put("k1", "v1");
        map.put("k2", "v2");
        System.out.println(JSONObject.toJSONString(map));
        // {"k1":"v1","k2":"v2"}
    }
    @Test
    public void fromList(){
        System.out.println(
                JSONObject.toJSONString(
                        Monkey.getMonkeys()));
        // [{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"},{"id":1,"location":"Hua Guo Shan","name":"Sun WuKong"}]
    }
}

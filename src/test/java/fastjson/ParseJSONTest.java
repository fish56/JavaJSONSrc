package fastjson;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import entity.Monkey;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParseJSONTest {
    @Test
    public void toObject(){
        System.out.println(
                JSONObject.parseObject(
                        Monkey.getMonkeyString(), Monkey.class).getName());
        // Sun WuKong
    }

    @Test
    public void toMap(){
        Map<String, String> map = new HashMap<String, String>();
        throw new RuntimeException("to do: parse to map");
    }

    @Test
    public void toList(){
        List<Monkey> monkeys = JSONArray.parseArray(
                Monkey.getMonkeysString(), Monkey.class);
        System.out.println(monkeys.size());
        // 100
    }
}

package entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Monkey {
    private String name;
    private Integer id;
    private String location;
    public static Monkey getMonkey(){
        return new Monkey("Sun WuKong", 1, "Hua Guo Shan");
    }
    public static List<Monkey> getMonkeys(){
        List<Monkey> monkeys = new ArrayList<Monkey>();
        for (int i = 0; i < 100; i++) {
            monkeys.add(getMonkey());
        }
        return monkeys;
    }
    public static  String getMonkeyString(){
        return "{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"}";
    }
    public static String getMonkeysString(){
        return "[{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"},{\"id\":1,\"location\":\"Hua Guo Shan\",\"name\":\"Sun WuKong\"}]\n";
    }
}

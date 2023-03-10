package nya.nekoneko.checker;

import org.noear.snack.ONode;

/**
 * @author Ho
 */
public class Main {
    public static void main(String[] args) {
//        String s = """
//                {"code":0,"message":"信息"}
//                """;
        String s = """
                {"code":0,,.."message":"信息"}
                """;
        ONode oNode = JsonChecker.parseJson(s);
        System.out.println(oNode.toJson());
    }
}
package nya.nekoneko.checker;

import org.noear.snack.ONode;

/**
 * @author Ho
 */
public class JsonChecker {
    public static ONode parseJson(String json){
        return ONode.loadStr(json);
    }
    public void validateJsonFormat(String json){
        if (null == json || "".equals(json.strip())) {

        }
    }
}

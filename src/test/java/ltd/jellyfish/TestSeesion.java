package ltd.jellyfish;

import org.apache.tomcat.websocket.WsSession;
import org.junit.Test;

import com.alibaba.fastjson.JSON;

import jakarta.websocket.DeploymentException;
import jakarta.websocket.Session;

public class TestSeesion {

    @Test
    public void testSerlizeSession() throws DeploymentException{
        Session session = null;
        String json = JSON.toJSONString(session);
        System.out.println(json);
    }
}

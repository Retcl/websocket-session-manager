package ltd.jellyfish.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.websocket.Session;

@Service
public class MapControlService {

    @Autowired
    private Map<String, String> sessionMap;

    public void setMap(String key, String value) {
        sessionMap.put(key, value);
    }

    public String getValue(String key) {
        return sessionMap.get(key);
    }

    public List<String> getKeys() {
        List<String> keyList = new ArrayList<>();
        for (Map.Entry<String, String> entry : sessionMap.entrySet()) {
            keyList.add(entry.getKey());
        }
        return keyList;
    }

    public List<String> getValues(){
        List<String> valueList = new ArrayList<>();
        for (Map.Entry<String, String> entry : sessionMap.entrySet()) {
            valueList.add(entry.getValue());
        }
        return valueList;
    }

    public void remove(String key) {
        sessionMap.remove(key);
    }

    public void removeAll() {
        sessionMap.clear();
    }

    public void modify(String key, String value) {
        sessionMap.remove(key);
        sessionMap.put(key, value);
    }
}

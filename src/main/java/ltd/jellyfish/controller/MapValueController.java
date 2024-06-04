package ltd.jellyfish.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ltd.jellyfish.service.MapControlService;

@RestController
public class MapValueController {

    @Autowired
    private MapControlService mapControlService;

    @PostMapping("/set")
    public void setMap(@RequestParam("key") String key, @RequestParam("value") String value) {
        mapControlService.setMap(key, value);
    }

    @DeleteMapping("/clear")
    public void clearMap(){
        mapControlService.removeAll();
    }

    @DeleteMapping("/remove")
    public void remove(@RequestParam("key") String key) {
        mapControlService.remove(key);
    }

    @GetMapping("/keys")
    public List<String> getAllKey() {
        return mapControlService.getKeys();
    }

    @GetMapping("/values")
    public List<String> getAllValue(){
        return mapControlService.getValues();
    }

    @GetMapping("/value")
    public String getValues(@RequestParam("key") String key) {
        return mapControlService.getValue(key);
    }

    @PutMapping("/modify")
    public void modify(@RequestParam("key") String key, @RequestParam("value") String value) {
        mapControlService.modify(key, value);
    }
}

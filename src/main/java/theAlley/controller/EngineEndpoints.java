package theAlley.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;
import theAlley.service.DarknessConstants;
import theAlley.service.EngineService;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * In game engine endpoints Author: Timotheuzi
 */
@RestController
public class EngineEndpoints {

    //@Autowired
    //UserRepo UserRepo;

    //@Autowired
    //MapRepo maprepo;

    @Autowired
    EngineService engineService;

    //@Autowired
    //CacheRepo cacheRepos;

    //@Autowired
    //ThymeleafController tempController;

    @RequestMapping(method = RequestMethod.GET, path = "/createNewUser", produces = MediaType.TEXT_HTML_VALUE)
    public Mono<String> createNewUser(@RequestParam(name = "name", required = true) String name) {
        if (engineService.createNewUser(name)) {
            return Mono.just("New User Created name " + name + " created....");
        } else {
            return Mono.just("User already exists, logging in using " + name + " and redirect to home");
        }
    }

    @RequestMapping(method = RequestMethod.GET, path = "/setUser", produces = MediaType.APPLICATION_JSON_VALUE)
    public String setUser(@RequestParam(name = "name", required = true) String name,
                          @RequestParam(name = "lvl", required = false) Integer lvl,
                          @RequestParam(name = "money", required = false) Integer money,
                          @RequestParam(name = "exp", required = false) Integer exp,
                          @RequestParam(name = "attack", required = false) Integer attack,
                          @RequestParam(name = "defense", required = false) Integer defense,
                          @RequestParam(name = "description", required = false) String description,
                          @RequestParam(name = "location", required = false) Integer location,
                          @RequestParam(name = "hp", required = false) Integer hp) {
		/* TODO set user update/new attributes
		//int id = userRepo.findByName(name).getId();

		UserDB newEntry = new UserDB();
		//newEntry.setId(id);
		newEntry.setName(name);
		if (lvl != null) {
			newEntry.setLvl(lvl);
		} else {
			//newEntry.setLvl(userRepo.findByName(name).getLvl());
		}

		if (money != null) {
			newEntry.setMoney(money);
		} else {
			newEntry.setMoney(userRepo.findByName(name).getMoney());
		}

		if (exp != null) {
			newEntry.setExp(exp);
		} else {
			newEntry.setExp(userRepo.findByName(name).getExp());
		}

		if (attack != null) {
			newEntry.setAttack(attack);
		} else {
			newEntry.setAttack(userRepo.findByName(name).getAttack());
		}

		if (defense != null) {
			newEntry.setDefense(defense);
		} else {
			newEntry.setDefense(userRepo.findByName(name).getDefense());
		}

		if (description != null) {
			newEntry.setDescription(description);
		} else {
			newEntry.setDescription(userRepo.findByName(name).getDescription());
		}

		if (location != null) {
			newEntry.setLocation(location);
		} else {
			newEntry.setDescription(userRepo.findByName(name).getDescription());
		}

		if (hp != null) {
			newEntry.setLocation(hp);
		} else {
			newEntry.setHp(userRepo.findByName(name).getHp());
		}

		userRepo.save(newEntry);
		*/

        return "hello";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/getFullInformation", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getFullInformation(@RequestParam(name = "name", required = true) String name,
                                     @RequestParam(name = "user", required = false, defaultValue = "user") String user) {
        return "engineService.getStats(name)";
    }

    @GetMapping("/CountMaps")
    public Integer CountMaps() {
        String result = "";
        Integer count = 0;
		/*for (MapDB mapDB : maprepo.findAll()) {
			count++;
		}*/
        return count;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/initializeMap", produces = MediaType.TEXT_HTML_VALUE)
    public String initializeMap() {
        // Response response =
        engineService.initializeMapValues();
        return "Success initializing map values";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/initializeNpc", produces = MediaType.TEXT_HTML_VALUE)
    public String initializeNpc() {
        engineService.initializeNpcValues();
        return "Success initializing npc values";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/initializeItem", produces = MediaType.TEXT_HTML_VALUE)
    public String initializeItem() {
        engineService.initializeItemValues();
        return "Success initializing item values";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/variousInput", produces = MediaType.APPLICATION_JSON_VALUE)
    // consumes
    public String various(@RequestParam(name = "name", required = true) String name,
                          @RequestParam(name = "value", required = false, defaultValue = "") String value,
                          @RequestParam(name = "location", required = false, defaultValue = "0") Integer location) {
        if (!value.isEmpty()) {
            value = value.replaceAll(",", "");
            //todo caching
            //Methods.updateCache(location, value);
        }
        Map<String, String> output = new HashMap<>();
        if (value.toLowerCase().contains("move")) {
            engineService.move(name);
            output.put("mapInfo", DarknessConstants.map_1);
            output.put("npcInfo", DarknessConstants.npc_1);
            return "output";
        } else if (value.toLowerCase().contains("inv")
                && value.toLowerCase().contains(engineService.ShowNpcsInLocation(location).toString())) {
            Iterator it = engineService.ShowNpcsInLocation(location).entrySet().iterator();
            return "Methods.getStats(name)";
        } else {
            output.put("msg", "No implementation for that string yet");
            return "output";
        }
    }

    @RequestMapping(method = RequestMethod.GET, path = "/updateRoom", produces = MediaType.APPLICATION_JSON_VALUE)
    public Map updateRoom(@RequestParam(name = "mapIndex", required = false) Integer mapIndex) {
        if (mapIndex != null) {
            return engineService.mapStatus(mapIndex);
        } else {

            return engineService.mapStatus(mapIndex);
        }
    }

    @RequestMapping(method = RequestMethod.GET, path = "/findUserByIndex", produces = MediaType.APPLICATION_JSON_VALUE)
    public String findUserByIndex(@RequestParam(name = "index", required = true) Integer index) {
        // int[] updateRoom = Methods.mapStatus(location);
        return "Methods.getUserByIndex(index)";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/findNpcByIndex", produces = MediaType.APPLICATION_JSON_VALUE)
    public String findNpcByIndex(@RequestParam(name = "index", required = true) Integer index) {
        // int[] updateRoom = Methods.mapStatus(location);
        return engineService.getNpcByIndex(index);
    }

}
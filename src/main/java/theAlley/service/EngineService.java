package theAlley.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import theAlley.db.UserRepo;
import theAlley.db.MapRepo;
import theAlley.db.ItemsRepo;
import theAlley.db.NpcRepo;

import theAlley.db.UserDB;
import theAlley.db.MapDB;
import theAlley.db.ItemsDB;
import theAlley.db.NpcDB;

import java.io.StringWriter;
import java.util.*;

@Service
public class EngineService {

    @Autowired
    UserRepo userRepos;

    @Autowired
    MapRepo mapRepos;

    @Autowired
    ItemsRepo itemsRepos;

    @Autowired
    NpcRepo npcRepos;


    public void initializeMapValues() {
        //Integer mapCount = CountMaps();
        MapDB mapDB = new MapDB();
        mapDB.setName("map_" + (CountMaps() + 1));
        if (CountMaps() == 0) {
            mapDB.setDescription(DarknessConstants.map_0);
        } else if ((CountMaps() & 1) == 0) {
            mapDB.setDescription(DarknessConstants.map_1);
        } else {
            mapDB.setDescription(DarknessConstants.map_2);
        }
        mapDB.setItems(0);
        mapDB.setNpcs(0);
        mapDB.setUsers(0);
        mapRepos.save(mapDB);
    }

    public void initializeItemValues() {
        int itemCount = 0;
        double attack = Math.random() * ((10 - 1) + 1);
        double defense = Math.random() * ((5 - 1) + 1);
        ItemsDB itemsDB = new ItemsDB();
        itemsDB.setName("gun	_" + itemCount);
        itemsDB.setDescription(DarknessConstants.item_0);
        itemsDB.setAttack((int) attack);
        itemsDB.setDefense((int) defense);
        // itemsDB.location(0);
        itemsRepos.save(itemsDB);
    }

    public void initializeNpcValues() {
        int attack = (int) (Math.random() * ((50 - 1) + 1));
        int defense = (int) (Math.random() * ((10 - 1) + 1));
        int hp = (int) (Math.random() * ((1000 - 1) + 1));
        NpcDB npcDB = new NpcDB();
        if (CountNpcs() == 0) {
            npcDB.setName("Frank");
            npcDB.setDescription(DarknessConstants.npc_0);
            npcDB.setLocation(1);
            npcDB.setAttack(75);
            npcDB.setDefense(75);
            npcDB.setHp(3000);
        } else {
            npcDB.setName(getMeAgoodName());
            npcDB.setDescription(DarknessConstants.npc_1);
            npcDB.setLocation(2);
            npcDB.setAttack(attack);
            npcDB.setDefense(defense);
            npcDB.setHp(hp);
        }
        npcRepos.save(npcDB);
    }

    public Boolean createNewUser(String name) {
        try {
            UserDB result = userRepos.findByName(name);
			/*result.toStream().toList().get(name).getName()
			result.getName();
			result.getLvl();
			result.getMoney();
			result.getExp();
			result.getAttack();
			result.getDefense();
			result.getDescription();
			result.getLocation();
			result.getHp();
			String test = result.toString();
			System.out.println("record does exist:" + test);*/
            return false;
        } catch (Exception e) {
            System.out.println("record doesnt exist, creating it");
        }
        UserDB newEntry = new UserDB();
        newEntry.setName(name);
        newEntry.setLvl(1);
        newEntry.setMoney(1);
        newEntry.setExp(1);
        newEntry.setAttack(1);
        newEntry.setDefense(1);
        newEntry.setDescription("A weak vagrant with no weapon");
        newEntry.setLocation(1);
        newEntry.setHp(1000);
        userRepos.save(newEntry);
        return true;
    }

    //TODO get stats totally broken
	/*public HashMap<String, Integer> getStats(String name) {
		HashMap<String, Integer> stats = new HashMap<String, Integer>();
		stats.put("ID", userRepos.findByName(name).getId());
		stats.put("attack", userRepos.findByName(name).getAttack());
		stats.put("defense", userRepos.findByName(name).getDefense());
		stats.put("exp", userRepos.findByName(name).getExp());
		stats.put("location", userRepos.findByName(name).getLocation());
		stats.put("lvl", userRepos.findByName(name).getLvl());
		stats.put("money", userRepos.findByName(name).getMoney());

		else {
			stats.put("ID", npcRepos.findByName(name).getId());
			stats.put("attack", npcRepos.findByName(name).getAttack());
			stats.put("defense", npcRepos.findByName(name).getDefense());
			stats.put("hp", npcRepos.findByName(name).getHp());
			stats.put("location", npcRepos.findByName(name).getLocation());
			// stats.put("name", npcRepos.findByName(name).);
		}
		return stats;
	}*/

    // counters
    public Integer CountMaps() {
        // String result = "";
        Integer count = 0;
        //Flux<MapDB> mapDB : mapRepos.findAll().next()) {
        //	count++;
        //}
        return count;
    }

    //todo count users totally broken
	/*public Integer CountUsers() {
		Integer count = 0;
		for (Flux<UserDB> userdb : userRepos.findAll()) {
			count++;
		}
		return count; // + "response" + response;
	}*/

    public Integer CountItems() {
        Integer count = 0;
        //for (ItemsDB itemdb : itemsRepos.findAll()) {
        //	count++;
        //}
        return count;
    }

    public Integer CountNpcs() {
        Integer count = 0;
		/*for(NpcDB itemdb : npcRepos.findAll())
		{
				count++;
		}*/
        return count;
    }

    public String CountNpcsByLocation(Integer location) {
        StringWriter npcs = new StringWriter();
        Integer count = 0;
		/*for (NpcDB npcDB : npcRepos.findAll()) {
			if (npcDB.getLocation() == location) {
				npcs.write(npcDB.getName() + ",");
				count++;
			}
		}*/
        return npcs.toString();
    }

    //todo totally broken
	/*public String CountUsersByLocation(int location) {
		StringWriter users = new StringWriter();
		int count = 0;
		for (UserDB userDB : userRepos.findAll()) {
			if (userDB.getLocation() == location) {
				users.write(userDB.getName() + ",");
				count++;
			}
		}
		return users.toString();
	}*/

    //todo broken
	/*public HashMap<Integer, String> ShowUsersInLocation(Integer index) {
		HashMap<Integer, String> users = new HashMap<Integer, String>();
		for (UserDB userDB : userRepos.findAll()) {
			if (userDB.getLocation() == index) {
				users.put(userDB.getId(), userDB.getName());
			}
		}
		return users;
	}*/

    public HashMap<Integer, String> ShowNpcsInLocation(Integer index) {
        HashMap<Integer, String> npcs = new HashMap<Integer, String>();
		/*for (NpcDB npcDB : npcRepos.findAll()) {
			if (npcDB.getLocation() == index) {
				npcs.put(npcDB.getId(), npcDB.getName());
			}
		}*/
        return npcs;

    }

    public Integer move(String name) {
        if (CountMaps() < 11) initializeMapValues();
        Double location = Math.random() * ((CountMaps()));
        /* random NPC generation and movement */
        Double npcToMove = Math.random() * ((CountNpcs()));
        int temp = npcToMove.intValue();
        //npcRepos.findById(temp).get().setLocation(location.intValue());
        //userRepos.findByName(name).setLocation(location.intValue());
        // Model model = null;
        // templateController.template_1(name, model);
        return location.intValue();
    }

    public Map<Integer, String> mapStatus(Integer mapIndex) {
        HashMap<Integer, String> mapObj = new HashMap<Integer, String>();
        int count = 0;
        //Iterator<Map.Entry<Integer, String>> itUser = (ShowUsersInLocation(mapIndex)).entrySet().iterator();
		/*while (itUser.hasNext()) {
			Map.Entry<Integer, String> pair = itUser.next();
			mapObj.put(count, pair.getValue());
			itUser.remove(); // avoids a ConcurrentModificationException
			count++;
		}*/
        Iterator<Map.Entry<Integer, String>> itNpc = (ShowNpcsInLocation(mapIndex)).entrySet().iterator();
        while (itNpc.hasNext()) {
            Map.Entry<Integer, String> pair = itNpc.next();
            mapObj.put(count, pair.getValue());
            itNpc.remove(); // avoids a ConcurrentModificationException
            count++;
        }
        //TODO caching part not decided how this will work
		/*for (CacheDB cacheDB : cacheRepos.findAll()) {
			mapObj.put(count, cacheDB());
			count++;
		}*/

        return mapObj;
    }
    //// get individual user or npc
	/*public String getUserByName(String name) {
		return userRepos.findByName(name).getName();
	}*/

    public String getNpcByName(String name) {
        return null;
        //return npcRepos.findByName(name).getName();
    }

	/*public String getUserByIndex(Integer index) {
		return userRepos.findById(index).get().getName();
	}*/

    public String getNpcByIndex(Integer index) {
        return null;
        //return npcRepos.findById(index).get().getName();
    }

    public String getStatus(String where) {
        return where;
    }


    // todo this doesnt create very good names
    String getMeAgoodName() {
        Random rand = new Random();
        String vocals = "aeiou" + "ioaeu" + "ouaei";
        String cons = "bcdfghjklznpqrst" + "bcdfgjklmnprstvw" + "bcdfgjklmnprst";
        // String allchars = vocals + cons;
        int length = rand.nextInt(8);
        if (length < 3)
            length = 3;
        // int consnum = 1;
        int consnum = 1;
        String name = "";
        String touse;
        char c;

        for (int i = 0; i < length; i++) {
            if (consnum == 2) {
                touse = vocals;
                consnum = rand.nextInt(2);
            } else
                touse = cons;
            // pick a random character from the set we are goin to use.
            c = touse.charAt(rand.nextInt(touse.length()));
            name = name + c;
            if (cons.indexOf(c) != -1)
                consnum++;
            if (vocals.indexOf(c) != -1)
                consnum = consnum - 1;
        }
        name = name.charAt(0) + name.substring(1);
        System.out.println(name);
        return name;

    }
    //todo caching
	/*public void updateCache(Integer location, String msg) {
		CacheDB newCacheEntry = new CacheDB();
		//newCacheEntry.(msg);
		//newCacheEntry("map_" + location);
		cacheRepos.save(newCacheEntry);
		// return Methods.getNpcByIndex(index);
	}*/
    //todo old finds
		/*public Map findUserStatsByName(String name) throws JSONException {
		Map userObj = new HashMap();
		try {
			userObj.put("name", userRepos.findByName(name).getName());
			userObj.put("attack", userRepos.findByName(name).getAttack());
			userObj.put("defense", userRepos.findByName(name).getDefense());
			userObj.put("description", userRepos.findByName(name).getDescription());
			userObj.put("exp", userRepos.findByName(name).getExp());
			userObj.put("hp", userRepos.findByName(name).getHp());
			userObj.put("location", userRepos.findByName(name).getLocation());
			userObj.put("lvl", userRepos.findByName(name).getLvl());
			userObj.put("money", userRepos.findByName(name).getMoney());
			userObj.put("name", userRepos.findByName(name).getName());
		} catch (Exception e) {
			e.printStackTrace();
			return (HashMap) userObj.put("error", e.toString());
		}
		return userObj;
	}*/
}

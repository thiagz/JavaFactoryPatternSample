/*
 * This factory class creates the instance of Monster
 */
package org.thiagz.factory;

/**
 *
 * @author Thiagz
 */
public class MonsterFactory {
    
    public Monster createMonster(String type){
        
        Monster monsterInstance = null;
        
        if(type.equals("Flying")){
            monsterInstance = new FlyingMonster();
        }else if(type.equals("Crawl")){
            monsterInstance = new CrawlingMonster();
        }
        
        return monsterInstance;
    }
}

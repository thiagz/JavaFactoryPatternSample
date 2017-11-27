/*
 * This is the client game application that will create multiple monsters
 * using the Factory class
 * 
 */
package org.thiagz.factory;

/**
 *
 * @author Thiagz
 */
public class MonsterGameClient {
    
    public static void main(String args[]){
        
        Monster flyingMonster = new MonsterFactory().createMonster("Flying");
        flyingMonster.action();
        Monster crawlingMonster = new MonsterFactory().createMonster("Crawl");
        crawlingMonster.action();
    }
}

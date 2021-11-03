package lab1;

import java.util.*;

import lab1.Character;

public class Game {
    private String gameName;
    private String developer;
    private List<Character>characterList;

    public String getGameName() {
        return gameName;
    }
    public String getDeveloper() {
        return developer;
    }
    public List<Character> getCharacterList() {
        return characterList;
    }

    public static class Builder {
        private Game newGame;

        public Builder() {
            newGame = new Game();
        }

        public Builder withGameName(String name){
            newGame.gameName = name;
            return this;
        }

        public Builder withDeveloper(String developer){
            newGame.developer = developer;
            return this;
        }

        public Builder withList(List<Character> list){
            newGame.characterList = list;
            return this;
        }

        public Game build(){
            return newGame;
        }

    }

    public static List<Character> filter(List<Character> list, String name){

        for(int i = list.size()-1; i >=0 ;i--){
            if(list.get(i).getName() == name) {
                list.remove(i);
            }
        }
        return list;
    }

    @Override
    public String toString() {
        return "Game{" +
                "gameName='" + gameName + '\'' +
                ", developer='" + developer + '\'' +
                ", characterList=" + characterList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return gameName.equals(game.gameName) && Objects.equals(developer, game.developer) && Objects.equals(characterList, game.characterList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gameName, developer, characterList);
    }
}

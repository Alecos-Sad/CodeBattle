package by.sadovnick;

import java.util.List;

/**
 * Создайте функцию, которая подсчитывает количество директорий в массиве
 * (в пути содержится директория/директории или указан путь к директории).
 * Примеры:
 * 1  == solution(["C:/Projects/something.txt","file.exe"])
 * 0  == solution(["brain-games.exe","gendiff.sh","task-manager.rb"])
 * 3  == solution(["C:/Users/JohnDoe/Music/Beethoven_5.mp3","/usr/bin","/var/www/myprojectt"])
 */
public class СчитатьКоличествоДиректорийВМассиве {
    public static void main(String[] args) {
        System.out.println(solution(List.of("C:/Users/JohnDoe/Music/Beethoven_5.mp3", "/usr/bin", "/var/www/myprojectt")));
    }

    public static Integer solution(List<String> filepaths) {
        return (int) filepaths.stream()
                .filter(str -> str.contains("/"))
                .count();
    }
}

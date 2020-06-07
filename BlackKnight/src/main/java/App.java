import model.dao.CharacterDao;
import model.entity.Character;
import model.entity.MainCharacter;

/**
 * Hello world!
 *
 */

public class App 
{

    public static void main( String[] args )
    {
        CharacterDao mainCharacterDao = new CharacterDao();
        Character mainCharacter = mainCharacterDao.findById(25);
        System.out.println(mainCharacter.getName());
    }
}

package xupt.se.ttms.idao;

import xupt.se.ttms.dao.PlayDAO;
import xupt.se.ttms.dao.StudioDAO;

public class DAOFactory
{
    private static iStudioDAO stuDao;

    private static iPlayDAO playDao;

    public static synchronized iStudioDAO creatStudioDAO()
    {
        if(null == stuDao)
            stuDao=new StudioDAO();
        return stuDao;
    }

    public static synchronized iPlayDAO creatPlayDAO()
    {
        if(null == playDao)
            playDao=new PlayDAO();
        return playDao;
    }
}

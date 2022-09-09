
public class Point3d {
    /** Координата X точки **/
    private double xCoord;

    /** координата Y точки **/
    private double yCoord;
    
    /** координата Z точки **/
    private double zCoord;

    /** Конструктор инициализирующий начальное значение координат точки (x, y). **/
    public Point3d(double x, double y, double z) {
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }
 
    /** конструктор без аргументов:  по умолчанию точка ставится в начало координат. **/
    public Point3d() {
       // Вызываем конструктор с двумя аргументами для инициализации позиции.
        this(0, 0, 0);
    }

    /** Возвращает координату X точки. **/
    public double getX() {
        return xCoord;
    }

    /** Возвращает координату Y точки. **/
    public double getY() {
        return yCoord;
    }

    /** Возвращает координату Y точки. **/
    public double getZ() {
        return zCoord;
    }
    
    /** Изменяет координату X точки. **/
    public void setX(double val) {
        xCoord = val;
    }

    /** Изменяет координату Y точки. **/
    public void setY(double val) {
        yCoord = val;
    }

    /** Изменяет координату Y точки. **/
    public void setZ(double val) {
        zCoord = val;
    }
    
    /** Сравнение точек. **/
    @Override
    public boolean equals(Object obj) {
    	//obj это Point3D?
    	if(obj instanceof Point3d)
    	{
    		 // приведем объект other к типу Point3d, 
    		 // и затем сравним. 
    		Point3d other = (Point3d)obj;
    		if((xCoord == other.getX())&&(yCoord == other.getY())&&(zCoord == other.getZ()))
    		{
    			return true;
    		}
    	}
    	// Иначе объекты не равны
        return false;
    }
    
    
    public double distanceTo(Object objectB) {
    	//pointA и pointB это Point3D?
    	if(objectB instanceof Point3d)
    	{   
   		 // приведем объекты objectA и objectВ к типу Point3d. 
   		 Point3d pointA = (Point3d)objectB;
   		    		 
    	return Math.sqrt(Math.pow(pointA.getX() - xCoord, 2)+Math.pow(pointA.getY() - yCoord, 2)+Math.pow(pointA.getZ() - zCoord, 2));
       	}
    	// Иначе выводим ошибку
        return -1.0;
    }

}

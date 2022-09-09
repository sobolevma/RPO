
public class Point3d {
    /** ���������� X ����� **/
    private double xCoord;

    /** ���������� Y ����� **/
    private double yCoord;
    
    /** ���������� Z ����� **/
    private double zCoord;

    /** ����������� ���������������� ��������� �������� ��������� ����� (x, y). **/
    public Point3d(double x, double y, double z) {
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }
 
    /** ����������� ��� ����������:  �� ��������� ����� �������� � ������ ���������. **/
    public Point3d() {
       // �������� ����������� � ����� ����������� ��� ������������� �������.
        this(0, 0, 0);
    }

    /** ���������� ���������� X �����. **/
    public double getX() {
        return xCoord;
    }

    /** ���������� ���������� Y �����. **/
    public double getY() {
        return yCoord;
    }

    /** ���������� ���������� Y �����. **/
    public double getZ() {
        return zCoord;
    }
    
    /** �������� ���������� X �����. **/
    public void setX(double val) {
        xCoord = val;
    }

    /** �������� ���������� Y �����. **/
    public void setY(double val) {
        yCoord = val;
    }

    /** �������� ���������� Y �����. **/
    public void setZ(double val) {
        zCoord = val;
    }
    
    /** ��������� �����. **/
    @Override
    public boolean equals(Object obj) {
    	//obj ��� Point3D?
    	if(obj instanceof Point3d)
    	{
    		 // �������� ������ other � ���� Point3d, 
    		 // � ����� �������. 
    		Point3d other = (Point3d)obj;
    		if((xCoord == other.getX())&&(yCoord == other.getY())&&(zCoord == other.getZ()))
    		{
    			return true;
    		}
    	}
    	// ����� ������� �� �����
        return false;
    }
    
    
    public double distanceTo(Object objectB) {
    	//pointA � pointB ��� Point3D?
    	if(objectB instanceof Point3d)
    	{   
   		 // �������� ������� objectA � object� � ���� Point3d. 
   		 Point3d pointA = (Point3d)objectB;
   		    		 
    	return Math.sqrt(Math.pow(pointA.getX() - xCoord, 2)+Math.pow(pointA.getY() - yCoord, 2)+Math.pow(pointA.getZ() - zCoord, 2));
       	}
    	// ����� ������� ������
        return -1.0;
    }

}

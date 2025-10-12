 class Fish
{
	String breed  ;
	String type ;
	double  price ;
	String color ;
    
	Fish(String breed  , String type , double  price  , String color )
	{
		super();
		this.breed  = breed ;
		this.type = type ;
		this.price = price   ;
		this.color = color ;
	}
	public void displayFish()
	{
		System.out.println(" ** FISH  DETAILS ** ");
		System.out.println( " Breed =  " + breed  +", Type =  "+ type  +" , Price =  "+  price  +" , Color =  "+color);
	   System.out.println();
	}
}
class FishTank
{
	String material ;
	String shape ;
	String  dim  ;
	double capacity ;
	double   price ;
	
	Water water ;
	Stone stone ;
	Plant plant ;
	FishFood food ;
	Light light ;
	Filter filter ;
	Fish fish ;  // null
	
	 FishTank(String material , String shape , String  dim, double capacity  , double   price )
	{
		 super();
		this.material = material ;
		this.shape = shape  ;
		this.dim = dim ;
		this.capacity = capacity ;
		this.price  = price  ;
	}
	public void displayFishTank()
	{
		System.out.println("**  FISH TANK  DETAILS ** ");
		System.out.println( " FISH TANK [ Material =  " + material + " , Shape = "+ shape + " ,Dimension = " + dim +" ,Capacity = " + capacity + " ,Price = " +price + " ] ");
		  System.out.println();
	}
	public void addFish()
	{
		if(water != null)
		{
			fish = new Fish("Goldfish" , "Freshwater Fish " , 150 ,"Golden");
		}
		else{
			System.out.println("Add water first ");
		}
	}
	public void addWater()
	{
		water = new Water(" Distilled water" , 10, 7);
	}
	public void addFood()
	{
	food  = new FishFood(" Chitale " , 100, 120);
	}
	public void addStone()
	{
		stone = new Stone (" circular " , 5 , 100 , "2.5gm");
	}
	public void addPlant()
	{
		plant = new Plant (" Herbs " , 150 , "green"  , 3);
	}
	public void addLight()
	{
		light = new Light ("Venus Neo " , 250 ," 2watt"  , " Neutral White Light");
	}
	public void addFilter()
	{
		filter = new Filter ("Aquarium Internal Filter" , 400 , 15  , "240v");
	}
}
class Water
{
	String type ;
	double  liter  ;
	double ph ;
	
	Water(String type , double  liter  , double ph )
	{
		super();
		
		this.type = type ;
		this.liter = liter   ;
		this.ph = ph ;
	}
	public void displayWater()
	{
		System.out.println(" ** WATER  DETAILS ** ");
		System.out.println( " WATER [  Type=  " + type + " , Liter = "+ liter + " , pH = " + ph  + " ] ");
		  System.out.println();
	}
	
}
class FishFood
{
	String brand  ;
	double quantity ;
	double  price  ;
	
	FishFood(String brand   ,  double  quantity  , double price )
	{
		super();
		this.brand  = brand  ;
		this.quantity = quantity ;
		this.price= price ;
	}
	public void displayFishFood()
	{
		System.out.println(" ** FISH FOOD   DETAILS ** ");
		System.out.println( " Fish Food [ Brand =  " + brand  + " , Quantity = "+ quantity + " , Price  = " + price  + " ] ");
	   System.out.println();
	}
	
}
class Plant
{
	String type ;
	double  price  ;
	String color ;
	int quantity ;
	
	Plant(String type , double  price  , String color, int quantity )
	{
		super();
		this.type = type ;
		this.price = price   ;
		this.color = color ;
		this.quantity  = quantity ;
	}
	public void displayPlant()
	{
		System.out.println(" ** PLANT  DETAILS ** ");
		System.out.println( " Type  =  " + type   +", Price =  "+ price   +" , Color =  "+  color +" , Quantity =  "+quantity);
	   System.out.println();
	}
}
class Stone
{
	String shape  ;
	int quantity ;
	double  price ;
	String  weight  ;
	
	Stone(String shape  , int quantity  , double   price , String  weight )
	{
		super();
		this.shape   = shape  ;
		this.quantity = quantity ;
		this.price  = price ;
		this.weight = weight  ;
		
	}
	     public void displayStone()
	{
		System.out.println(" ** STONE   DETAILS ** ");
		System.out.println( " Shape  =  " + shape + "  , Quantity = " + quantity   +", Price =  "+ price   +" , Weight  =  "+  weight );
	   System.out.println();   
	}
}
class Light 
{
	String brand ;
    double price ;
	String  watt ;
	String color;
	
	Light(String brand , double  price , String watt , String color)
	{
		super();
		this.brand  = brand  ;
		this.price = price ;
		this.watt = watt  ;
		this.color =  color ;
	}
	public void displayLight()
	{
		System.out.println(" ** LIGHT  DETAILS ** ");
		System.out.println( " Brand  =  " + brand    +", Price =  "+ price   +" , Watt  =  "+  watt +" , Color =  "+color);
	   System.out.println();
	}
}
class Filter
{
	String brand ;
    double price ;
	int watt ;
	String cap ;
	
	Filter(String brand , double  price , int watt , String cap)
	{
		super();
		this.brand  = brand  ;
		this.price = price ;
		this.watt = watt  ;
		this.cap =  cap ;
	}
	public void displayFilter()
	{
		System.out.println(" ** FILTER  DETAILS ** ");
		System.out.println( " Brand  =  " + brand    +", Price =  "+ price   +" , Watt  =  "+  watt +" , Capacity =  "+cap);
	   System.out.println();
}
}
class FishTankDriver	 
{
	public static void main(String[] args) 
	{
		FishTank tank = new FishTank("Glass " , "Rectangle" , "30h x 15w x 50l" ,1000 , 12);
		tank.displayFishTank();
		tank.addWater();
		tank.water.displayWater();
		tank.addFish();
		tank.fish.displayFish();
		tank.addFood();
		tank.food.displayFishFood();
		tank.addStone();
		tank.stone.displayStone();
		tank.addPlant();
		tank.plant.displayPlant();
		tank.addLight();
		tank.light.displayLight();
		tank.addFilter();
		tank.filter.displayFilter();
	}
}
package com.geek.mode;

import com.geek.mode.adapter.DuckAdapter;
import com.geek.mode.adapter.GreenDuck;
import com.geek.mode.adapter.Turkey;
import com.geek.mode.adapter.WildTurkey;
import com.geek.mode.agent.Proxy;
import com.geek.mode.agent.Source;
import com.geek.mode.bridge.SonyControl;
import com.geek.mode.bridge.TvControl;
import com.geek.mode.bridge.TvControlabs;
import com.geek.mode.builder.Builder3d;
import com.geek.mode.builder.Director;
import com.geek.mode.chainms.Approver;
import com.geek.mode.chainms.Client;
import com.geek.mode.chainms.DepartmentApprover;
import com.geek.mode.chainms.GroupApprover;
import com.geek.mode.chainms.PresidentApprover;
import com.geek.mode.command.Command;
import com.geek.mode.command.CommandModeControl;
import com.geek.mode.command.Light;
import com.geek.mode.command.LightOffCommand;
import com.geek.mode.command.LightOnCommand;
import com.geek.mode.decorator.Chocolate;
import com.geek.mode.decorator.Decaf;
import com.geek.mode.decorator.DrinkComponent;
import com.geek.mode.decorator.Milk;
import com.geek.mode.facade.HomeTheaterFacade;
import com.geek.mode.factory.Pizza;
import com.geek.mode.factory.PizzaFactory;
import com.geek.mode.factory2.Factory;
import com.geek.mode.factory2.GreekFactory;
import com.geek.mode.factory3.AFactory;
import com.geek.mode.factory3.ATypeFactory;
import com.geek.mode.factory3.Coffee;
import com.geek.mode.flyweight.TreeManager;
import com.geek.mode.interpreter.Add;
import com.geek.mode.interpreter.Constant;
import com.geek.mode.interpreter.Context;
import com.geek.mode.interpreter.Division;
import com.geek.mode.interpreter.Expression;
import com.geek.mode.interpreter.Multiply;
import com.geek.mode.interpreter.Subtract;
import com.geek.mode.interpreter.Variable;
import com.geek.mode.iterator.CakeMenu;
import com.geek.mode.iterator.DinerMenu;
import com.geek.mode.iterator.Waitress;
import com.geek.mode.mediator.Alarm;
import com.geek.mode.mediator.ConcreteMediator;
import com.geek.mode.mediator.Curtain;
import com.geek.mode.mediator.Mediator;
import com.geek.mode.observer.CurrentConditions;
import com.geek.mode.observer.WeatherData;
import com.geek.mode.prototype.ConcretePrototype;
import com.geek.mode.prototype.Prototype;
import com.geek.mode.state.CandyMachine;
import com.geek.mode.strategy.Duck;
import com.geek.mode.strategy.GreenHeadDuck;
import com.geek.mode.strategy.RedHeadDuck;
import com.geek.mode.template.HotDrinkTemplate;
import com.geek.mode.template.Tea;
import com.geek.mode.visitor.ConcreteVisitor;
import com.geek.mode.visitor.Employee;
import com.geek.mode.visitor.Employees;

import memento.MementoCareTaker;
import memento.Originator;

public class Test {
	
	public static void main(String[] args) {
//		strategy();
//		observer();
//		observer2();
//		decorator();
//		factory1();
//		factory2();
//		factory3();
//		command();
//		adapter();
//		facade();
//		template();
//		iterator();
//		compose();
//		state();
//		proxy();
//		bridge();
//		builder();
//		chainms();
//		flyWeight();
//		interpreter();
//		mediator();
//		memento();
//		prototype();
		visitor();
	}

	private static void visitor() {
		Employees employees = new Employees();
		employees.attach(new Employee("Tom", 3));
		employees.attach(new Employee("Jerry", 4));
		employees.accept(new ConcreteVisitor());
	}

	private static void prototype() {
		Prototype prototype = new ConcretePrototype("Levi");
		System.out.println(((ConcretePrototype)prototype).getName());
		System.out.println(((ConcretePrototype)prototype.objClone()).getName());
	}

	private static void memento() {
		MementoCareTaker careTaker = new MementoCareTaker();
		Originator originator = new Originator();
		originator.addValue("blood", 100);
		careTaker.saveMemento("originator", originator.createMemento());
		System.out.println(originator.getValue("blood"));
		originator.addValue("blood", 80);
		System.out.println(originator.getValue("blood"));
		originator.restoreMemento(careTaker.retrieveMemento("originator"));
		System.out.println(originator.getValue("blood"));
	}

	private static void mediator() {
		Mediator mediator = new ConcreteMediator();
		Alarm alarm = new Alarm(mediator);
		Curtain curtain = new Curtain(mediator);
		alarm.sendMsg(0);
		curtain.sendMsg(1);
	}

	private static void interpreter() {
		Context con = new Context();
		Variable a = new Variable();
		Variable b = new Variable();
		Constant c = new Constant(2);
		con.addValue(a, 6);
		con.addValue(b, 7);
		Expression ex = new Division(new Multiply(a, b), new Add(new Subtract(a, b), c));
		System.out.println(ex.interpret(con));
	}

	private static void flyWeight() {
		TreeManager manager = new TreeManager();
		manager.displayTree();
	}

	private static void chainms() {
		Client mClient = new Client();
		Approver ga = new GroupApprover("Tom");
		Approver da = new DepartmentApprover("Jerry");
		Approver pa = new PresidentApprover("Bush");
		ga.setSuccessor(da);
		da.setSuccessor(pa);
		pa.setSuccessor(ga);
		ga.processRequest(mClient.sendRequest(1000));
	}

	private static void builder() {
		Director director = new Director(new Builder3d(8));
		director.construct();
	}

	private static void bridge() {
		TvControlabs tc = new TvControl(new SonyControl());
		tc.onOff();
		tc.onOff();
	}

	private static void proxy() {
		Proxy proxy = new Proxy(new Source());
		proxy.say();
	}

	private static void state() {
		CandyMachine cm = new CandyMachine(3);
		cm.printState();
		cm.insertCoin();
		cm.printState();
		cm.turnCrank();
		cm.printState();
	}

	private static void compose() {
		com.geek.mode.compose.Waitress wt = new com.geek.mode.compose.Waitress();
		wt.addIterator(new com.geek.mode.compose.CakeMenu().getIterator());
		wt.addIterator(new com.geek.mode.compose.DinerMenu().getIterator());
		wt.printMenu();
	}

	private static void iterator() {
		Waitress waitress = new Waitress();
		waitress.addIterator(new CakeMenu().getIterator());
		waitress.addIterator(new DinerMenu().getIterator());
		waitress.printMenu();
	}

	private static void template() {
		HotDrinkTemplate tea = new Tea();
		tea.prepareRecipe();
	}

	private static void facade() {
		HomeTheaterFacade htf = new HomeTheaterFacade();
		htf.ready();
		htf.play();
	}

	private static void adapter() {
		com.geek.mode.adapter.Duck duck = new GreenDuck();
		duck.quack();
		duck.longFly();
		Turkey turkey = new WildTurkey();
		turkey.gobble();
		turkey.shortFly();
		com.geek.mode.adapter.Duck adapter = new DuckAdapter(turkey);
		adapter.quack();
		adapter.longFly();
		DuckAdapter adapter2 = new DuckAdapter(turkey);
		adapter2.quack();
		adapter2.longFly();
	}

	private static void command() {
		CommandModeControl cmc = new CommandModeControl();
		Light light = new Light("bed");
		cmc.setCommand(new LightOnCommand(light), new LightOffCommand(light));
		cmc.onButton(0);
		cmc.offButton(0);
	}

	private static void factory3() {
		AFactory factory = new ATypeFactory();
		Pizza pizza = factory.createPizza();
		Coffee coffee = factory.createCoffee();
	}

	private static void factory2() {
		Factory factory = new GreekFactory();
		Pizza pizza = factory.createPizza();
	}

	private static void factory1() {
		PizzaFactory factory = new PizzaFactory();
		Pizza pizza = factory.createPizza("greek");
	}

	private static void decorator() {
		DrinkComponent order = new Decaf();
		System.out.println(order.getDescription()+" cost:"+order.cost());
		order = new Milk(order);
		order = new Chocolate(order);
		System.out.println(order.getDescription()+" cost:"+order.cost());
	}

	private static void strategy() {
		Duck gDuck = new GreenHeadDuck();
		Duck rDuck = new RedHeadDuck();
		
		gDuck.display();
		gDuck.fly();
		gDuck.quack();
		gDuck.swim();
		
		rDuck.display();
		rDuck.fly();
		rDuck.quack();
		rDuck.swim();
	}
	
	private static void observer(){
		WeatherData wd = new WeatherData();
		CurrentConditions c1 = new CurrentConditions(1);
		CurrentConditions c2 = new CurrentConditions(2);
		
		wd.registerObserver(c1);
		wd.registerObserver(c2);
		wd.updateTemp(18);
		wd.removeObserver(c1);
		wd.updateTemp(25);
	}
	
	private static void observer2(){
		WeatherData wd = new WeatherData();
		CurrentConditions c1 = new CurrentConditions(1);
		CurrentConditions c2 = new CurrentConditions(2);
		wd.registerObserver(c1);
		wd.registerObserver(c2);
		wd.updateTemp(25);
	}

}

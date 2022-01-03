package Project;
import Components.Activation;
import Components.Condition;
import Components.GuardMapping;
import Components.PetriNet;
import Components.PetriNetWindow;
import Components.PetriTransition;
import DataObjects.DataInteger;
import DataObjects.DataString;
import DataObjects.DataTransfer;
import DataOnly.TransferOperation;
import Enumerations.LogicConnector;
import Enumerations.TransitionCondition;
import Enumerations.TransitionOperation;

import java.util.ArrayList;

public class Controller4Lanes {

	public static void main (String []args) {
		PetriNet pn = new PetriNet();
		pn.PetriNetName = "Controller4Lanes";
		pn.SetName("Controller4Lanes");
		pn.NetworkPort = 1081;
		
		DataString ini = new DataString();
		//ini.Printable = false;
		ini.SetName("ini");
		ini.SetValue("red");
		pn.ConstantPlaceList.add(ini);
		
		DataString red = new DataString();
		//red.Printable = false;
		red.SetName("red");
		red.SetValue("red");
		pn.ConstantPlaceList.add(red);
		
		DataString green = new DataString();
		//green.Printable = false;
		green.SetName("green");
		green.SetValue("green");
		pn.ConstantPlaceList.add(green);
		
		DataString yellow = new DataString();
		//yellow.Printable = false;
		yellow.SetName("yellow");
		yellow.SetValue("yellow");
		pn.ConstantPlaceList.add(yellow);

		DataInteger zero = new DataInteger();
		zero.SetName("zero");
		zero.SetValue(0);
		pn.ConstantPlaceList.add(zero);

		DataInteger three = new DataInteger();
		three.SetName("three");
		three.SetValue(3);
		pn.ConstantPlaceList.add(three);

		DataInteger one = new DataInteger();
		one.SetName("one");
		one.SetValue(1);
		pn.ConstantPlaceList.add(one);



		DataString r1r2r3r4 = new DataString();
		r1r2r3r4.SetName("r1r2r3r4");
		r1r2r3r4.SetValue("signal");
		pn.PlaceList.add(r1r2r3r4);

		DataString g1r2r3r4 = new DataString();
		g1r2r3r4.SetName("g1r2r3r4");
		pn.PlaceList.add(g1r2r3r4);

		DataString y1r2r3r4 = new DataString();
		y1r2r3r4.SetName("y1r2r3r4");
		pn.PlaceList.add(y1r2r3r4);

		DataString r1g2r3r4 = new DataString();
		r1g2r3r4.SetName("r1g2r3r4");
		pn.PlaceList.add(r1g2r3r4);

		DataString r1y2r3r4 = new DataString();
		r1y2r3r4.SetName("r1y2r3r4");
		pn.PlaceList.add(r1y2r3r4);

		DataString r1r2g3r4 = new DataString();
		r1r2g3r4.SetName("r1r2g3r4");
		pn.PlaceList.add(r1r2g3r4);

		DataString r1r2y3r4 = new DataString();
		r1r2y3r4.SetName("r1r2y3r4");
		pn.PlaceList.add(r1r2y3r4);

		DataString r1r2r3g4 = new DataString();
		r1r2r3g4.SetName("r1r2r3g4");
		pn.PlaceList.add(r1r2r3g4);

		DataString r1r2r3y4 = new DataString();
		r1r2r3y4.SetName("r1r2r3y4");
		pn.PlaceList.add(r1r2r3y4);


		DataString in1 = new DataString();
		in1.SetName("in1");
		pn.PlaceList.add(in1);

		DataString in2 = new DataString();
		in2.SetName("in2");
		pn.PlaceList.add(in2);

		DataString in3 = new DataString();
		in3.SetName("in3");
		pn.PlaceList.add(in3);

		DataString in4 = new DataString();
		in4.SetName("in4");
		pn.PlaceList.add(in4);


		DataInteger counter1 = new DataInteger();
		counter1.SetName("counter1");
		counter1.SetValue(3);
		pn.PlaceList.add(counter1);

		DataInteger counter2 = new DataInteger();
		counter2.SetName("counter2");
		counter1.SetValue(3);
		pn.PlaceList.add(counter2);

		DataInteger counter3 = new DataInteger();
		counter3.SetName("counter3");
		counter1.SetValue(3);
		pn.PlaceList.add(counter3);

		DataInteger counter4 = new DataInteger();
		counter4.SetName("counter4");
		counter1.SetValue(3);
		pn.PlaceList.add(counter4);


		DataString PlusTL1 = new DataString();
		PlusTL1.SetName("PlusTL1");
		pn.PlaceList.add(PlusTL1);

		DataString PlusTL2 = new DataString();
		PlusTL2.SetName("PlusTL2");
		pn.PlaceList.add(PlusTL2);

		DataString PlusTL3 = new DataString();
		PlusTL3.SetName("PlusTL3");
		pn.PlaceList.add(PlusTL3);

		DataString PlusTL4 = new DataString();
		PlusTL4.SetName("PlusTL4");
		pn.PlaceList.add(PlusTL4);


		DataTransfer p6 = new DataTransfer();
		p6.SetName("OP1");
		p6.Value = new TransferOperation("localhost", "1080" , "si_s");
		pn.PlaceList.add(p6);

		DataTransfer p7 = new DataTransfer();
		p7.SetName("OP2");
		p7.Value = new TransferOperation("localhost", "1080" , "gg_s");
		pn.PlaceList.add(p7);

		DataTransfer p8 = new DataTransfer();
		p8.SetName("OP3");
		p8.Value = new TransferOperation("localhost", "1080" , "hd_s");
		pn.PlaceList.add(p8);

		DataTransfer p9 = new DataTransfer();
		p9.SetName("OP4");
		p9.Value = new TransferOperation("localhost", "1080" , "bta_s");
		pn.PlaceList.add(p9);


		//----------------------------iniT------------------------------------
		PetriTransition iniT = new PetriTransition(pn);
		iniT.TransitionName = "iniT";

		Condition iniTCt1 = new Condition(iniT, "ini", TransitionCondition.NotNull);

		GuardMapping grdiniT = new GuardMapping();
		grdiniT.condition= iniTCt1;

		grdiniT.Activations.add(new Activation(iniT, "ini", TransitionOperation.SendOverNetwork, "OP1"));
		grdiniT.Activations.add(new Activation(iniT, "ini", TransitionOperation.SendOverNetwork, "OP2"));
		grdiniT.Activations.add(new Activation(iniT, "ini", TransitionOperation.SendOverNetwork, "OP3"));
		grdiniT.Activations.add(new Activation(iniT, "ini", TransitionOperation.SendOverNetwork, "OP4"));
		grdiniT.Activations.add(new Activation(iniT, "", TransitionOperation.MakeNull, "ini"));

		iniT.GuardMappingList.add(grdiniT);

		iniT.Delay = 0;
		pn.Transitions.add(iniT);



		//----------------------------T1------------------------------------
		PetriTransition t1 = new PetriTransition(pn);
		t1.TransitionName = "T1";
		t1.InputPlaceName.add("r1r2r3r4");


		Condition T1Ct1 = new Condition(t1, "r1r2r3r4", TransitionCondition.NotNull);

		GuardMapping grdT1 = new GuardMapping();
		grdT1.condition= T1Ct1;
		grdT1.Activations.add(new Activation(t1, "r1r2r3r4", TransitionOperation.Move, "g1r2r3r4"));
		grdT1.Activations.add(new Activation(t1, "green", TransitionOperation.SendOverNetwork, "OP1"));
		t1.GuardMappingList.add(grdT1);

		t1.Delay = 2;
		pn.Transitions.add(t1);

		//----------------------------T2------------------------------------
		PetriTransition t2 = new PetriTransition(pn);
		t2.TransitionName = "T2";
		t2.InputPlaceName.add("g1r2r3r4");


		Condition T2Ct11 = new Condition(t2, "g1r2r3r4", TransitionCondition.NotNull);
		Condition T2Ct12 = new Condition(t2, "in1", TransitionCondition.IsNull);
		T2Ct11.SetNextCondition(LogicConnector.AND, T2Ct12);

		GuardMapping grdT21 = new GuardMapping();
		grdT21.condition= T2Ct11;
		grdT21.Activations.add(new Activation(t2, "g1r2r3r4", TransitionOperation.Move, "y1r2r3r4"));
		grdT21.Activations.add(new Activation(t2, "yellow", TransitionOperation.SendOverNetwork, "OP1"));
		grdT21.Activations.add(new Activation(t2, "counter1", TransitionOperation.Move, "counter1"));

		t2.GuardMappingList.add(grdT21);


		Condition T2Ct21 = new Condition(t2, "g1r2r3r4", TransitionCondition.NotNull);
		Condition T2Ct22 = new Condition(t2, "counter1", TransitionCondition.MoreThan, "zero");
		Condition T2Ct23 = new Condition(t2, "in1", TransitionCondition.NotNull);
		T2Ct22.SetNextCondition(LogicConnector.AND, T2Ct23);
		T2Ct21.SetNextCondition(LogicConnector.AND, T2Ct22);

		GuardMapping grdT22 = new GuardMapping();
		grdT22.condition = T2Ct21;

		ArrayList<String> lstInput = new ArrayList<String>();
		lstInput.add("counter1");
		lstInput.add("one");
		grdT22.Activations.add(new Activation(t2, lstInput, TransitionOperation.Sub, "counter1"));
		grdT22.Activations.add(new Activation(t2, "g1r2r3r4", TransitionOperation.Move, "PlusTL1"));

		t2.GuardMappingList.add(grdT22);


		Condition T2Ct31 = new Condition(t2,"counter1", TransitionCondition.Equal, "zero");
		Condition T2Ct32 = new Condition(t2, "g1r2r3r4", TransitionCondition.NotNull);
		T2Ct31.SetNextCondition(LogicConnector.AND, T2Ct32);

		GuardMapping grdT23 = new GuardMapping();
		grdT23.condition = T2Ct31;
		grdT23.Activations.add(new Activation(t2, "g1r2r3r4", TransitionOperation.Move, "y1r2r3r4"));
		grdT23.Activations.add(new Activation(t2, "three", TransitionOperation.Move, "counter1"));
		grdT23.Activations.add(new Activation(t2, "yellow", TransitionOperation.SendOverNetwork, "OP1"));

		t2.GuardMappingList.add(grdT23);

		t2.Delay = 2;
		pn.Transitions.add(t2);


		//----------------------------T1 Plus------------------------------------
		PetriTransition t1plus = new PetriTransition(pn);
		t1plus.TransitionName = "t1plus";
		t1plus.InputPlaceName.add("PlusTL1");

		Condition T1plusCt1 = new Condition(t1plus, "PlusTL1", TransitionCondition.NotNull);

		GuardMapping grdT1plus = new GuardMapping();
		grdT1plus.condition= T1plusCt1;
		grdT1plus.Activations.add(new Activation(t1plus, "PlusTL1", TransitionOperation.Move, "g1r2r3r4"));

		t1plus.GuardMappingList.add(grdT1plus);
		t1plus.Delay = 0;
		pn.Transitions.add(t1plus);

		//----------------------------T3------------------------------------
		PetriTransition t3 = new PetriTransition(pn);
		t3.TransitionName = "T3";
		t3.InputPlaceName.add("y1r2r3r4");



		Condition T3Ct1 = new Condition(t3, "y1r2r3r4", TransitionCondition.NotNull);

		GuardMapping grdT3 = new GuardMapping();
		grdT3.condition= T3Ct1;
		grdT3.Activations.add(new Activation(t3, "y1r2r3r4", TransitionOperation.Move, "r1g2r3r4"));
		grdT3.Activations.add(new Activation(t3, "red", TransitionOperation.SendOverNetwork, "OP1"));
		grdT3.Activations.add(new Activation(t3, "green", TransitionOperation.SendOverNetwork, "OP2"));

		t3.GuardMappingList.add(grdT3);

		t3.Delay = 2;
		pn.Transitions.add(t3);


		//----------------------------T4------------------------------------
		PetriTransition t4 = new PetriTransition(pn);
		t4.TransitionName = "T4";
		t4.InputPlaceName.add("r1g2r3r4");


		Condition T4Ct11 = new Condition(t4, "r1g2r3r4", TransitionCondition.NotNull);
		Condition T4Ct12 = new Condition(t4, "in2", TransitionCondition.IsNull);
		T4Ct11.SetNextCondition(LogicConnector.AND, T4Ct12);

		GuardMapping grdT41 = new GuardMapping();
		grdT41.condition= T4Ct11;
		grdT41.Activations.add(new Activation(t4, "r1g2r3r4", TransitionOperation.Move, "r1y2r3r4"));
		grdT41.Activations.add(new Activation(t4, "yellow", TransitionOperation.SendOverNetwork, "OP2"));
		grdT41.Activations.add(new Activation(t4, "counter2", TransitionOperation.Move, "counter2"));

		t4.GuardMappingList.add(grdT41);


		Condition T4Ct21 = new Condition(t4, "r1g2r3r4", TransitionCondition.NotNull);
		Condition T4Ct22 = new Condition(t4, "counter2", TransitionCondition.MoreThan, "zero");
		Condition T4Ct23 = new Condition(t4, "in2", TransitionCondition.NotNull);
		T4Ct22.SetNextCondition(LogicConnector.AND, T4Ct23);
		T4Ct21.SetNextCondition(LogicConnector.AND, T4Ct22);

		GuardMapping grdT42 = new GuardMapping();
		grdT42.condition = T4Ct21;

		ArrayList<String> lstInput4 = new ArrayList<String>();
		lstInput4.add("counter2");
		lstInput4.add("one");
		grdT42.Activations.add(new Activation(t4, lstInput4, TransitionOperation.Sub, "counter2"));
		grdT42.Activations.add(new Activation(t4, "r1g2r3r4", TransitionOperation.Move, "PlusTL2"));

		t4.GuardMappingList.add(grdT42);


		Condition T4Ct31 = new Condition(t4,"counter2", TransitionCondition.Equal, "zero");
		Condition T4Ct32 = new Condition(t4, "r1g2r3r4", TransitionCondition.NotNull);
		T4Ct31.SetNextCondition(LogicConnector.AND, T4Ct32);

		GuardMapping grdT43 = new GuardMapping();
		grdT43.condition = T4Ct31;
		grdT43.Activations.add(new Activation(t4, "r1g2r3r4", TransitionOperation.Move, "r1y2r3r4"));
		grdT43.Activations.add(new Activation(t4, "three", TransitionOperation.Move, "counter2"));
		grdT43.Activations.add(new Activation(t4, "yellow", TransitionOperation.SendOverNetwork, "OP2"));

		t4.GuardMappingList.add(grdT43);

		t4.Delay = 2;
		pn.Transitions.add(t4);


		//----------------------------T2 Plus------------------------------------
		PetriTransition t2plus = new PetriTransition(pn);
		t2plus.TransitionName = "t2plus";
		t2plus.InputPlaceName.add("PlusTL2");

		Condition T2plusCt1 = new Condition(t2plus, "PlusTL2", TransitionCondition.NotNull);

		GuardMapping grdT2plus = new GuardMapping();
		grdT2plus.condition= T2plusCt1;
		grdT2plus.Activations.add(new Activation(t2plus, "PlusTL2", TransitionOperation.Move, "r1g2r3r4"));

		t2plus.GuardMappingList.add(grdT2plus);
		t2plus.Delay = 0;
		pn.Transitions.add(t2plus);

		//----------------------------T5------------------------------------
		PetriTransition t5 = new PetriTransition(pn);
		t5.TransitionName = "T5";
		t5.InputPlaceName.add("r1y2r3r4");


		Condition T5Ct1 = new Condition(t5, "r1y2r3r4", TransitionCondition.NotNull);

		GuardMapping grdT5 = new GuardMapping();
		grdT5.condition= T5Ct1;
		grdT5.Activations.add(new Activation(t5, "r1y2r3r4", TransitionOperation.Move, "r1r2g3r4"));
		grdT5.Activations.add(new Activation(t5, "red", TransitionOperation.SendOverNetwork, "OP2"));
		grdT5.Activations.add(new Activation(t5, "green", TransitionOperation.SendOverNetwork, "OP3"));


		t5.GuardMappingList.add(grdT5);

		t5.Delay = 2;
		pn.Transitions.add(t5);

		//----------------------------T6------------------------------------
		PetriTransition t6 = new PetriTransition(pn);
		t6.TransitionName = "T6";
		t6.InputPlaceName.add("r1r2g3r4");


		Condition T6Ct11 = new Condition(t6, "r1r2g3r4", TransitionCondition.NotNull);
		Condition T6Ct12 = new Condition(t6, "in3", TransitionCondition.IsNull);
		T6Ct11.SetNextCondition(LogicConnector.AND, T6Ct12);

		GuardMapping grdT61 = new GuardMapping();
		grdT61.condition= T6Ct11;
		grdT61.Activations.add(new Activation(t6, "r1r2g3r4", TransitionOperation.Move, "r1r2y3r4"));
		grdT61.Activations.add(new Activation(t6, "yellow", TransitionOperation.SendOverNetwork, "OP3"));
		grdT61.Activations.add(new Activation(t6, "counter3", TransitionOperation.Move, "counter3"));

		t6.GuardMappingList.add(grdT61);


		Condition T6Ct21 = new Condition(t6, "r1r2g3r4", TransitionCondition.NotNull);
		Condition T6Ct22 = new Condition(t6, "counter3", TransitionCondition.MoreThan, "zero");
		Condition T6Ct23 = new Condition(t6, "in3", TransitionCondition.NotNull);
		T6Ct22.SetNextCondition(LogicConnector.AND, T6Ct23);
		T6Ct21.SetNextCondition(LogicConnector.AND, T6Ct22);

		GuardMapping grdT62 = new GuardMapping();
		grdT62.condition = T6Ct21;

		ArrayList<String> lstInput6 = new ArrayList<String>();
		lstInput6.add("counter3");
		lstInput6.add("one");
		grdT62.Activations.add(new Activation(t6, lstInput6, TransitionOperation.Sub, "counter3"));
		grdT62.Activations.add(new Activation(t6, "r1r2g3r4", TransitionOperation.Move, "PlusTL3"));

		t6.GuardMappingList.add(grdT62);


		Condition T6Ct31 = new Condition(t6,"counter3", TransitionCondition.Equal, "zero");
		Condition T6Ct32 = new Condition(t6, "r1r2g3r4", TransitionCondition.NotNull);
		T6Ct31.SetNextCondition(LogicConnector.AND, T6Ct32);

		GuardMapping grdT63 = new GuardMapping();
		grdT63.condition = T6Ct31;
		grdT63.Activations.add(new Activation(t6, "r1r2g3r4", TransitionOperation.Move, "r1r2y3r4"));
		grdT63.Activations.add(new Activation(t6, "three", TransitionOperation.Move, "counter3"));
		grdT63.Activations.add(new Activation(t6, "yellow", TransitionOperation.SendOverNetwork, "OP3"));

		t6.GuardMappingList.add(grdT63);

		t6.Delay = 2;
		pn.Transitions.add(t6);

		//----------------------------T3 Plus------------------------------------
		PetriTransition t3plus = new PetriTransition(pn);
		t3plus.TransitionName = "t3plus";
		t3plus.InputPlaceName.add("PlusTL3");

		Condition T3plusCt1 = new Condition(t3plus, "PlusTL3", TransitionCondition.NotNull);

		GuardMapping grdT3plus = new GuardMapping();
		grdT3plus.condition= T3plusCt1;
		grdT3plus.Activations.add(new Activation(t3plus, "PlusTL3", TransitionOperation.Move, "r1r2g3r4"));

		t3plus.GuardMappingList.add(grdT3plus);
		t3plus.Delay = 0;
		pn.Transitions.add(t3plus);

		//----------------------------T7------------------------------------
		PetriTransition t7 = new PetriTransition(pn);
		t7.TransitionName = "T7";
		t7.InputPlaceName.add("r1r2y3r4");


		Condition T7Ct1 = new Condition(t7, "r1r2y3r4", TransitionCondition.NotNull);

		GuardMapping grdT7 = new GuardMapping();
		grdT7.condition= T7Ct1;
		grdT7.Activations.add(new Activation(t7, "r1r2y3r4", TransitionOperation.Move, "r1r2r3g4"));
		grdT7.Activations.add(new Activation(t7, "red", TransitionOperation.SendOverNetwork, "OP3"));
		grdT7.Activations.add(new Activation(t7, "green", TransitionOperation.SendOverNetwork, "OP4"));


		t7.GuardMappingList.add(grdT7);

		t7.Delay = 2;
		pn.Transitions.add(t7);


		//----------------------------T8------------------------------------
		PetriTransition t8 = new PetriTransition(pn);
		t8.TransitionName = "T8";
		t8.InputPlaceName.add("r1r2r3g4");

		Condition T8Ct11 = new Condition(t8, "r1r2r3g4", TransitionCondition.NotNull);
		Condition T8Ct12 = new Condition(t8, "in4", TransitionCondition.IsNull);
		T8Ct11.SetNextCondition(LogicConnector.AND, T8Ct12);

		GuardMapping grdT81 = new GuardMapping();
		grdT81.condition= T8Ct11;
		grdT81.Activations.add(new Activation(t8, "r1r2r3g4", TransitionOperation.Move, "r1r2r3y4"));
		grdT81.Activations.add(new Activation(t8, "yellow", TransitionOperation.SendOverNetwork, "OP4"));
		grdT81.Activations.add(new Activation(t8, "counter4", TransitionOperation.Move, "counter4"));

		t8.GuardMappingList.add(grdT81);


		Condition T8Ct21 = new Condition(t8, "r1r2r3g4", TransitionCondition.NotNull);
		Condition T8Ct22 = new Condition(t8, "counter4", TransitionCondition.MoreThan, "zero");
		Condition T8Ct23 = new Condition(t8, "in4", TransitionCondition.NotNull);
		T8Ct22.SetNextCondition(LogicConnector.AND, T8Ct23);
		T8Ct21.SetNextCondition(LogicConnector.AND, T8Ct22);

		GuardMapping grdT82 = new GuardMapping();
		grdT82.condition = T8Ct21;

		ArrayList<String> lstInput8 = new ArrayList<String>();
		lstInput8.add("counter4");
		lstInput8.add("one");
		grdT82.Activations.add(new Activation(t8, lstInput8, TransitionOperation.Sub, "counter4"));
		grdT82.Activations.add(new Activation(t8, "r1r2r3g4", TransitionOperation.Move, "PlusTL4"));

		t8.GuardMappingList.add(grdT82);


		Condition T8Ct31 = new Condition(t8,"counter4", TransitionCondition.Equal, "zero");
		Condition T8Ct32 = new Condition(t8, "r1r2r3g4", TransitionCondition.NotNull);
		T8Ct31.SetNextCondition(LogicConnector.AND, T8Ct32);

		GuardMapping grdT83 = new GuardMapping();
		grdT83.condition = T8Ct31;
		grdT83.Activations.add(new Activation(t8, "r1r2r3g4", TransitionOperation.Move, "r1r2r3y4"));
		grdT83.Activations.add(new Activation(t8, "three", TransitionOperation.Move, "counter4"));
		grdT83.Activations.add(new Activation(t8, "yellow", TransitionOperation.SendOverNetwork, "OP4"));

		t8.GuardMappingList.add(grdT83);

		t8.Delay = 2;
		pn.Transitions.add(t8);

		//----------------------------T4 Plus------------------------------------
		PetriTransition t4plus = new PetriTransition(pn);
		t4plus.TransitionName = "t4plus";
		t4plus.InputPlaceName.add("PlusTL4");

		Condition T4plusCt1 = new Condition(t4plus, "PlusTL4", TransitionCondition.NotNull);

		GuardMapping grdT4plus = new GuardMapping();
		grdT4plus.condition= T4plusCt1;
		grdT4plus.Activations.add(new Activation(t4plus, "PlusTL4", TransitionOperation.Move, "r1r2r3g4"));

		t4plus.GuardMappingList.add(grdT4plus);
		t4plus.Delay = 0;
		pn.Transitions.add(t4plus);

		//----------------------------T9------------------------------------
		PetriTransition t9 = new PetriTransition(pn);
		t9.TransitionName = "T9";
		t9.InputPlaceName.add("r1r2r3y4");


		Condition T9Ct1 = new Condition(t9, "r1r2r3y4", TransitionCondition.NotNull);

		GuardMapping grdT9 = new GuardMapping();
		grdT9.condition= T9Ct1;
		grdT9.Activations.add(new Activation(t9, "r1r2r3y4", TransitionOperation.Move, "r1r2r3r4"));
		grdT9.Activations.add(new Activation(t9, "red", TransitionOperation.SendOverNetwork, "OP4"));

		t9.GuardMappingList.add(grdT9);

		t9.Delay = 2;
		pn.Transitions.add(t9);

		// -------------------------------------------------------------------------------------
		// ----------------------------PN Start-------------------------------------------------
		// -------------------------------------------------------------------------------------

		System.out.println("Exp1 started \n ------------------------------");
		pn.Delay = 2000;
		// pn.Start();

		PetriNetWindow frame = new PetriNetWindow(false);
		frame.petriNet = pn;
		frame.setVisible(true);
		
		
			
		
		
	}
}

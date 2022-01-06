package Project;

import Components.Activation;
import Components.Condition;
import Components.GuardMapping;
import Components.PetriNet;
import Components.PetriNetWindow;
import Components.PetriTransition;
import DataObjects.DataCar;
import DataObjects.DataCarQueue;
import DataObjects.DataString;
import DataObjects.DataTransfer;
import DataOnly.TransferOperation;
import Enumerations.LogicConnector;
import Enumerations.TransitionCondition;
import Enumerations.TransitionOperation;

public class Lanes_Intersection {
	public static void main(String[] args) {

		PetriNet pn = new PetriNet();
		pn.PetriNetName = "Lanes Intersection";

		pn.NetworkPort = 1080;

		DataString green = new DataString();
		green.Printable = false;
		green.SetName("green");
		green.SetValue("green");
		pn.ConstantPlaceList.add(green);

		DataString full = new DataString();
		full.SetName("full");
		full.SetValue("full");
		pn.ConstantPlaceList.add(full);

		// -------------------------------------------------------------------------------------------
		// --------------------------------Intersection1----------------------------------------------
		// -------------------------------------------------------------------------------------------

		DataCarQueue i1 = new DataCarQueue();
		i1.Value.Size = 3;
		i1.SetName("i1");
		pn.PlaceList.add(i1);

		// --------------------------------------------------------------------
		// -----------------Lane1 - Splaiul Independentei----------------------
		// --------------------------------------------------------------------

		DataCar si1 = new DataCar();
		si1.SetName("si1");
		pn.PlaceList.add(si1);

		DataCarQueue si_in = new DataCarQueue();
		si_in.Value.Size = 3;
		si_in.SetName("si_in");
		pn.PlaceList.add(si_in);

		DataString si_s = new DataString();
		si_s.SetName("si_s");
		pn.PlaceList.add(si_s);

		DataCar si2 = new DataCar();
		si2.SetName("si2");
		pn.PlaceList.add(si2);

		DataTransfer OP11 = new DataTransfer();
		OP11.SetName("OP11");
		OP11.Value = new TransferOperation("localhost", "1081" , "in1");
		pn.PlaceList.add(OP11);

		// --------------------------------------------------------------------
		// -----------------Lane2 - Giuseppe Garibaldi---------------------
		// --------------------------------------------------------------------

		DataCar gg1 = new DataCar();
		gg1.SetName("gg1");
		pn.PlaceList.add(gg1);

		DataCarQueue gg_in = new DataCarQueue();
		gg_in.Value.Size = 3;
		gg_in.SetName("gg_in");
		pn.PlaceList.add(gg_in);

		DataString gg_s = new DataString();
		gg_s.SetName("gg_s");
		pn.PlaceList.add(gg_s);

		DataCar gg2 = new DataCar();
		gg2.SetName("gg2");
		pn.PlaceList.add(gg2);

		DataTransfer OP12 = new DataTransfer();
		OP12.SetName("OP12");
		OP12.Value = new TransferOperation("localhost", "1081" , "in2");
		pn.PlaceList.add(OP12);

		// --------------------------------------------------------------------
		// -----------------Lane3 - From Horia Demian--------------------------
		// --------------------------------------------------------------------

		DataCar hd1 = new DataCar();
		hd1.SetName("hd1");
		pn.PlaceList.add(hd1);

		DataCarQueue hd_in = new DataCarQueue();
		hd_in.Value.Size = 3;
		hd_in.SetName("hd_in");
		pn.PlaceList.add(hd_in);

		DataString hd_s = new DataString();
		hd_s.SetName("hd_s");
		pn.PlaceList.add(hd_s);

		DataCar hd2 = new DataCar();
		hd2.SetName("hd2");
		pn.PlaceList.add(hd2);

		DataTransfer OP13 = new DataTransfer();
		OP13.SetName("OP13");
		OP13.Value = new TransferOperation("localhost", "1081" , "in3");
		pn.PlaceList.add(OP13);

		// --------------------------------------------------------------------
		// -----------------Lane4 - BT arena A-----------------------------------
		// --------------------------------------------------------------------

		DataCarQueue bta_in = new DataCarQueue();
		bta_in.Value.Size = 3;
		bta_in.SetName("bta_in");
		pn.PlaceList.add(bta_in);

		DataString bta_s = new DataString();
		bta_s.SetName("bta_s");
		pn.PlaceList.add(bta_s);

		DataCar bta2 = new DataCar();
		bta2.SetName("bta2");
		pn.PlaceList.add(bta2);

		DataTransfer OP14 = new DataTransfer();
		OP14.SetName("OP14");
		OP14.Value = new TransferOperation("localhost", "1081" , "in4");
		pn.PlaceList.add(OP14);

		// ----------------------------------------------------------------------------
		// --------------------Exit lane1 - Splaiul Independentei----------------------
		// ----------------------------------------------------------------------------

		DataCarQueue si_e = new DataCarQueue(); //p17.Printable = false;
		si_e.Value.Size = 3;
		si_e.SetName("si_e");
		pn.PlaceList.add(si_e);

		DataCar si_exit = new DataCar(); //p18.Printable = false;
		si_exit.SetName("si_exit");
		pn.PlaceList.add(si_exit);

		// ----------------------------------------------------------------------------
		// --------------------Exit lane2 - Giuseppe Garibaldi-------------------------
		// ----------------------------------------------------------------------------

		DataCarQueue gg_e = new DataCarQueue(); //p17.Printable = false;
		gg_e.Value.Size = 3;
		gg_e.SetName("gg_e");
		pn.PlaceList.add(gg_e);

		DataCar gg_exit = new DataCar(); //p18.Printable = false;
		gg_exit.SetName("gg_exit");
		pn.PlaceList.add(gg_exit);

		// ----------------------------------------------------------------------------
		// --------------------Exit lane3 - To Horia Demian----------------------------
		// ----------------------------------------------------------------------------

		DataCarQueue hd_e = new DataCarQueue(); //p17.Printable = false;
		hd_e.Value.Size = 3;
		hd_e.SetName("hd_e");
		pn.PlaceList.add(hd_e);

		DataCar hd_exit = new DataCar(); //p18.Printable = false;
		hd_exit.SetName("hd_exit");
		pn.PlaceList.add(hd_exit);


		// -------------------------------------------------------------------------------------------
		// --------------------------------Intersection2----------------------------------------------
		// -------------------------------------------------------------------------------------------

		DataCarQueue i2 = new DataCarQueue();
		i2.Value.Size = 3;
		i2.SetName("i2");
		pn.PlaceList.add(i2);

		// --------------------------------------------------------------------
		// -----------------Lane1 - Aleea Stadionului--------------------------
		// --------------------------------------------------------------------

		DataCar as1 = new DataCar();
		as1.SetName("as1");
		pn.PlaceList.add(as1);

		DataCarQueue as_in = new DataCarQueue();
		as_in.Value.Size = 3;
		as_in.SetName("as_in");
		pn.PlaceList.add(as_in);

		DataString as_s = new DataString();
		as_s.SetName("as_s");
		pn.PlaceList.add(as_s);

		DataCar as2 = new DataCar();
		as2.SetName("as2");
		pn.PlaceList.add(as2);

		DataTransfer OP21 = new DataTransfer();
		OP21.SetName("OP21");
		OP21.Value = new TransferOperation("localhost", "1082" , "in1");
		pn.PlaceList.add(OP21);

		// --------------------------------------------------------------------
		// -----------------Lane2 - Uzinei Electrice--------------------------
		// --------------------------------------------------------------------

		DataCar ue1 = new DataCar();
		ue1.SetName("ue1");
		pn.PlaceList.add(ue1);

		DataCarQueue ue_in = new DataCarQueue();
		ue_in.Value.Size = 3;
		ue_in.SetName("ue_in");
		pn.PlaceList.add(ue_in);

		DataString ue_s = new DataString();
		ue_s.SetName("ue_s");
		pn.PlaceList.add(ue_s);

		DataCar ue2 = new DataCar();
		ue2.SetName("ue2");
		pn.PlaceList.add(ue2);

		DataTransfer OP22 = new DataTransfer();
		OP22.SetName("OP22");
		OP22.Value = new TransferOperation("localhost", "1082" , "in2");
		pn.PlaceList.add(OP22);

		// --------------------------------------------------------------------
		// -----------------Lane3 - BT arena B-----------------------------------
		// --------------------------------------------------------------------

		DataCarQueue btb_in = new DataCarQueue();
		btb_in.Value.Size = 3;
		btb_in.SetName("btb_in");
		pn.PlaceList.add(btb_in);

		DataString btb_s = new DataString();
		btb_s.SetName("btb_s");
		pn.PlaceList.add(btb_s);

		DataCar btb2 = new DataCar();
		btb2.SetName("btb2");
		pn.PlaceList.add(btb2);

		DataTransfer OP23 = new DataTransfer();
		OP23.SetName("OP23");
		OP23.Value = new TransferOperation("localhost", "1082" , "in3");
		pn.PlaceList.add(OP23);

		// ----------------------------------------------------------------------------
		// --------------------Exit lane1 - Aleea Stadionului--------------------------
		// ----------------------------------------------------------------------------

		DataCarQueue as_e = new DataCarQueue(); //p17.Printable = false;
		as_e.Value.Size = 3;
		as_e.SetName("as_e");
		pn.PlaceList.add(as_e);

		DataCar as_exit = new DataCar(); //p18.Printable = false;
		as_exit.SetName("as_exit");
		pn.PlaceList.add(as_exit);

		// ----------------------------------------------------------------------------
		// --------------------Exit lane2 - Uzinei Electrice---------------------------
		// ----------------------------------------------------------------------------

		DataCarQueue ue_e = new DataCarQueue(); //p17.Printable = false;
		ue_e.Value.Size = 3;
		ue_e.SetName("ue_e");
		pn.PlaceList.add(ue_e);

		DataCar ue_exit = new DataCar(); //p18.Printable = false;
		ue_exit.SetName("ue_exit");
		pn.PlaceList.add(ue_exit);


		// -------------------------------------------------------------------------------------------
		// --------------------------------Transitions------------------------------------------------
		// -------------------------------------------------------------------------------------------

		// -----------------------------------------------------------------------------
		// --------------------------------Intersection 1---------------------------------
		// -----------------------------------------------------------------------------


		// ------------------------ Lane 1 - Splaiul Independentei ---------------------------

		// t_si1 ------------------------------------------------
		PetriTransition t_si1 = new PetriTransition(pn);
		t_si1.TransitionName = "t_si1";
		t_si1.InputPlaceName.add("si1");
		t_si1.InputPlaceName.add("si_in");

		Condition t_si1Ct1 = new Condition(t_si1, "si1", TransitionCondition.NotNull);
		Condition t_si1Ct2 = new Condition(t_si1, "si_in", TransitionCondition.CanAddCars);
		t_si1Ct1.SetNextCondition(LogicConnector.AND, t_si1Ct2);

		GuardMapping grdt_si1 = new GuardMapping();
		grdt_si1.condition = t_si1Ct1;
		grdt_si1.Activations.add(new Activation(t_si1, "si1", TransitionOperation.AddElement, "si_in"));
		t_si1.GuardMappingList.add(grdt_si1);

		Condition t_si1Ct3 = new Condition(t_si1, "si1", TransitionCondition.NotNull);
		Condition t_si1Ct4 = new Condition(t_si1, "si_in", TransitionCondition.CanNotAddCars);
		t_si1Ct3.SetNextCondition(LogicConnector.AND, t_si1Ct4);

		GuardMapping grdt_si_op = new GuardMapping();
		grdt_si_op.condition = t_si1Ct3;
		grdt_si_op.Activations.add(new Activation(t_si1, "full", TransitionOperation.SendOverNetwork, "OP11"));
		grdt_si_op.Activations.add(new Activation(t_si1, "si1", TransitionOperation.Copy, "si1"));
		t_si1.GuardMappingList.add(grdt_si1);

		t_si1.Delay = 0;
		pn.Transitions.add(t_si1);

		// t_si_in ------------------------------------------------
		PetriTransition t_si_in = new PetriTransition(pn);
		t_si_in.TransitionName = "t_si_in";
		t_si_in.InputPlaceName.add("si_in");
		t_si_in.InputPlaceName.add("si_s");

		Condition t_si_inCt1 = new Condition(t_si_in, "si_s", TransitionCondition.Equal, "green");
		Condition t_si_inCt2 = new Condition(t_si_in, "si_in", TransitionCondition.HaveCar);
		t_si_inCt1.SetNextCondition(LogicConnector.AND, t_si_inCt2);

		GuardMapping grdt_si_in = new GuardMapping();
		grdt_si_in.condition = t_si_inCt1;
		grdt_si_in.Activations.add(new Activation(t_si_in, "si_in", TransitionOperation.PopElementWithoutTarget, "si2"));
		grdt_si_in.Activations.add(new Activation(t_si_in, "si_s", TransitionOperation.Move, "si_s"));

		t_si_in.GuardMappingList.add(grdt_si_in);

//		t_si_in.Delay = 3;
		pn.Transitions.add(t_si_in);

		// t_si2 ------------------------------------------------
		PetriTransition t_si2 = new PetriTransition(pn);
		t_si2.TransitionName = "t_si2";
		t_si2.InputPlaceName.add("si2");
		t_si2.InputPlaceName.add("i1");

		Condition t_si2Ct1 = new Condition(t_si2, "si2", TransitionCondition.NotNull);
		Condition t_si2Ct2 = new Condition(t_si2, "i1", TransitionCondition.CanAddCars);
		t_si2Ct1.SetNextCondition(LogicConnector.AND, t_si2Ct2);

		GuardMapping grdt_si2 = new GuardMapping();
		grdt_si2.condition = t_si2Ct1;
		grdt_si2.Activations.add(new Activation(t_si2, "si2", TransitionOperation.AddElement, "i1"));
		t_si2.GuardMappingList.add(grdt_si2);

		t_si2.Delay = 0;
		pn.Transitions.add(t_si2);

		// ------------------------ Lane 1 exit - Splaiul Independentei-------------------------

		// t_si_e-----------------------------------------------------------
		PetriTransition t_si_e = new PetriTransition(pn);
		t_si_e.TransitionName = "t_si_e";
		t_si_e.InputPlaceName.add("i1");
		t_si_e.InputPlaceName.add("si_e");

		Condition t_si_eCt1 = new Condition(t_si_e, "i1", TransitionCondition.HaveCarForMe);
		Condition t_si_eCt2 = new Condition(t_si_e, "si_e", TransitionCondition.CanAddCars);
		t_si_eCt1.SetNextCondition(LogicConnector.AND, t_si_eCt2);

		GuardMapping grdt_si_e = new GuardMapping();
		grdt_si_e.condition = t_si_eCt1;
		grdt_si_e.Activations.add(new Activation(t_si_e, "i1", TransitionOperation.PopElementWithTargetToQueue, "si_e"));
		t_si_e.GuardMappingList.add(grdt_si_e);

		t_si_e.Delay = 0;
		pn.Transitions.add(t_si_e);

		// t_si_exit----------------------------------------------------------------

		PetriTransition t_si_exit = new PetriTransition(pn);
		t_si_exit.TransitionName = "t_si_exit";
		t_si_exit.InputPlaceName.add("si_e");

		Condition t_si_exitCt1 = new Condition(t_si_exit, "si_e", TransitionCondition.HaveCar);

		GuardMapping grdt_si_exit = new GuardMapping();
		grdt_si_exit.condition = t_si_exitCt1;
		grdt_si_exit.Activations.add(new Activation(t_si_exit, "si_e", TransitionOperation.PopElementWithoutTarget, "si_exit"));
		t_si_exit.GuardMappingList.add(grdt_si_exit);

		t_si_exit.Delay = 0;
		pn.Transitions.add(t_si_exit);


		// ------------------------ Lane 2 - Giuseppe Garibaldi ---------------------------

		// t_gg1 ------------------------------------------------
		PetriTransition t_gg1 = new PetriTransition(pn);
		t_gg1.TransitionName = "t_gg1";
		t_gg1.InputPlaceName.add("gg1");
		t_gg1.InputPlaceName.add("gg_in");

		Condition t_gg1Ct1 = new Condition(t_gg1, "gg1", TransitionCondition.NotNull);
		Condition t_gg1Ct2 = new Condition(t_gg1, "gg_in", TransitionCondition.CanAddCars);
		t_gg1Ct1.SetNextCondition(LogicConnector.AND, t_gg1Ct2);

		GuardMapping grdt_gg1 = new GuardMapping();
		grdt_gg1.condition = t_gg1Ct1;
		grdt_gg1.Activations.add(new Activation(t_gg1, "gg1", TransitionOperation.AddElement, "gg_in"));
		t_gg1.GuardMappingList.add(grdt_gg1);

		Condition t_gg1Ct3 = new Condition(t_gg1, "gg1", TransitionCondition.NotNull);
		Condition t_gg1Ct4 = new Condition(t_gg1, "gg_in", TransitionCondition.CanNotAddCars);
		t_gg1Ct3.SetNextCondition(LogicConnector.AND, t_gg1Ct4);

		GuardMapping grdt_gg_op = new GuardMapping();
		grdt_gg_op.condition = t_gg1Ct3;
		grdt_gg_op.Activations.add(new Activation(t_gg1, "full", TransitionOperation.SendOverNetwork, "OP12"));
		grdt_gg_op.Activations.add(new Activation(t_gg1, "gg1", TransitionOperation.Copy, "gg1"));
		t_gg1.GuardMappingList.add(grdt_gg1);

		t_gg1.Delay = 0;
		pn.Transitions.add(t_gg1);

		// t_gg_in ------------------------------------------------
		PetriTransition t_gg_in = new PetriTransition(pn);
		t_gg_in.TransitionName = "t_gg_in";
		t_gg_in.InputPlaceName.add("gg_in");
		t_gg_in.InputPlaceName.add("gg_s");

		Condition t_gg_inCt1 = new Condition(t_gg_in, "gg_s", TransitionCondition.Equal, "green");
		Condition t_gg_inCt2 = new Condition(t_gg_in, "gg_in", TransitionCondition.HaveCar);
		t_gg_inCt1.SetNextCondition(LogicConnector.AND, t_gg_inCt2);

		GuardMapping grdt_gg_in = new GuardMapping();
		grdt_gg_in.condition = t_gg_inCt1;
		grdt_gg_in.Activations.add(new Activation(t_gg_in, "gg_in", TransitionOperation.PopElementWithoutTarget, "gg2"));
		grdt_gg_in.Activations.add(new Activation(t_gg_in, "gg_s", TransitionOperation.Move, "gg_s"));

		t_gg_in.GuardMappingList.add(grdt_gg_in);

//		t_gg_in.Delay = 3;
		pn.Transitions.add(t_gg_in);

		// t_gg2 ------------------------------------------------
		PetriTransition t_gg2 = new PetriTransition(pn);
		t_gg2.TransitionName = "t_gg2";
		t_gg2.InputPlaceName.add("gg2");
		t_gg2.InputPlaceName.add("i1");

		Condition t_gg2Ct1 = new Condition(t_gg2, "gg2", TransitionCondition.NotNull);
		Condition t_gg2Ct2 = new Condition(t_gg2, "i1", TransitionCondition.CanAddCars);
		t_gg2Ct1.SetNextCondition(LogicConnector.AND, t_gg2Ct2);

		GuardMapping grdt_gg2 = new GuardMapping();
		grdt_gg2.condition = t_gg2Ct1;
		grdt_gg2.Activations.add(new Activation(t_gg2, "gg2", TransitionOperation.AddElement, "i1"));
		t_gg2.GuardMappingList.add(grdt_gg2);

		t_gg2.Delay = 0;
		pn.Transitions.add(t_gg2);

		// ------------------------ Lane 2 exit - Giuseppe Garibaldi-------------------------

		// t_gg_e-----------------------------------------------------------
		PetriTransition t_gg_e = new PetriTransition(pn);
		t_gg_e.TransitionName = "t_gg_e";
		t_gg_e.InputPlaceName.add("i1");
		t_gg_e.InputPlaceName.add("gg_e");

		Condition t_gg_eCt1 = new Condition(t_gg_e, "i1", TransitionCondition.HaveCarForMe);
		Condition t_gg_eCt2 = new Condition(t_gg_e, "gg_e", TransitionCondition.CanAddCars);
		t_gg_eCt1.SetNextCondition(LogicConnector.AND, t_gg_eCt2);

		GuardMapping grdt_gg_e = new GuardMapping();
		grdt_gg_e.condition = t_gg_eCt1;
		grdt_gg_e.Activations.add(new Activation(t_gg_e, "i1", TransitionOperation.PopElementWithTargetToQueue, "gg_e"));
		t_gg_e.GuardMappingList.add(grdt_gg_e);

		t_gg_e.Delay = 0;
		pn.Transitions.add(t_gg_e);

		// t_gg_exit----------------------------------------------------------------

		PetriTransition t_gg_exit = new PetriTransition(pn);
		t_gg_exit.TransitionName = "t_gg_exit";
		t_gg_exit.InputPlaceName.add("gg_e");

		Condition t_gg_exitCt1 = new Condition(t_gg_exit, "gg_e", TransitionCondition.HaveCar);

		GuardMapping grdt_gg_exit = new GuardMapping();
		grdt_gg_exit.condition = t_gg_exitCt1;
		grdt_gg_exit.Activations.add(new Activation(t_gg_exit, "gg_e", TransitionOperation.PopElementWithoutTarget, "gg_exit"));
		t_gg_exit.GuardMappingList.add(grdt_gg_exit);

		t_gg_exit.Delay = 0;
		pn.Transitions.add(t_gg_exit);



		// ------------------------ Lane 3 - Horia Demian ---------------------------

		// t_hd1 ------------------------------------------------
		PetriTransition t_hd1 = new PetriTransition(pn);
		t_hd1.TransitionName = "t_hd1";
		t_hd1.InputPlaceName.add("hd1");
		t_hd1.InputPlaceName.add("hd_in");

		Condition t_hd1Ct1 = new Condition(t_hd1, "hd1", TransitionCondition.NotNull);
		Condition t_hd1Ct2 = new Condition(t_hd1, "hd_in", TransitionCondition.CanAddCars);
		t_hd1Ct1.SetNextCondition(LogicConnector.AND, t_hd1Ct2);

		GuardMapping grdt_hd1 = new GuardMapping();
		grdt_hd1.condition = t_hd1Ct1;
		grdt_hd1.Activations.add(new Activation(t_hd1, "hd1", TransitionOperation.AddElement, "hd_in"));
		t_hd1.GuardMappingList.add(grdt_hd1);

		Condition t_hd1Ct3 = new Condition(t_hd1, "hd1", TransitionCondition.NotNull);
		Condition t_hd1Ct4 = new Condition(t_hd1, "hd_in", TransitionCondition.CanNotAddCars);
		t_hd1Ct3.SetNextCondition(LogicConnector.AND, t_hd1Ct4);

		GuardMapping grdt_hd_op = new GuardMapping();
		grdt_hd_op.condition = t_hd1Ct3;
		grdt_hd_op.Activations.add(new Activation(t_hd1, "full", TransitionOperation.SendOverNetwork, "OP13"));
		grdt_hd_op.Activations.add(new Activation(t_hd1, "hd1", TransitionOperation.Copy, "hd1"));
		t_hd1.GuardMappingList.add(grdt_hd1);

		t_hd1.Delay = 0;
		pn.Transitions.add(t_hd1);

		// t_hd_in ------------------------------------------------
		PetriTransition t_hd_in = new PetriTransition(pn);
		t_hd_in.TransitionName = "t_hd_in";
		t_hd_in.InputPlaceName.add("hd_in");
		t_hd_in.InputPlaceName.add("hd_s");

		Condition t_hd_inCt1 = new Condition(t_hd_in, "hd_s", TransitionCondition.Equal, "green");
		Condition t_hd_inCt2 = new Condition(t_hd_in, "hd_in", TransitionCondition.HaveCar);
		t_hd_inCt1.SetNextCondition(LogicConnector.AND, t_hd_inCt2);

		GuardMapping grdt_hd_in = new GuardMapping();
		grdt_hd_in.condition = t_hd_inCt1;
		grdt_hd_in.Activations.add(new Activation(t_hd_in, "hd_in", TransitionOperation.PopElementWithoutTarget, "hd2"));
		grdt_hd_in.Activations.add(new Activation(t_hd_in, "hd_s", TransitionOperation.Move, "hd_s"));

		t_hd_in.GuardMappingList.add(grdt_hd_in);

//		t_hd_in.Delay = 3;
		pn.Transitions.add(t_hd_in);

		// t_hd2 ------------------------------------------------
		PetriTransition t_hd2 = new PetriTransition(pn);
		t_hd2.TransitionName = "t_hd2";
		t_hd2.InputPlaceName.add("hd2");
		t_hd2.InputPlaceName.add("i1");

		Condition t_hd2Ct1 = new Condition(t_hd2, "hd2", TransitionCondition.NotNull);
		Condition t_hd2Ct2 = new Condition(t_hd2, "i1", TransitionCondition.CanAddCars);
		t_hd2Ct1.SetNextCondition(LogicConnector.AND, t_hd2Ct2);

		GuardMapping grdt_hd2 = new GuardMapping();
		grdt_hd2.condition = t_hd2Ct1;
		grdt_hd2.Activations.add(new Activation(t_hd2, "hd2", TransitionOperation.AddElement, "i1"));
		t_hd2.GuardMappingList.add(grdt_hd2);

		t_hd2.Delay = 0;
		pn.Transitions.add(t_hd2);

		// ------------------------ Lane 3 exit - Horia Demian-------------------------

		// t_hd_e-----------------------------------------------------------
		PetriTransition t_hd_e = new PetriTransition(pn);
		t_hd_e.TransitionName = "t_hd_e";
		t_hd_e.InputPlaceName.add("i1");
		t_hd_e.InputPlaceName.add("hd_e");

		Condition t_hd_eCt1 = new Condition(t_hd_e, "i1", TransitionCondition.HaveCarForMe);
		Condition t_hd_eCt2 = new Condition(t_hd_e, "hd_e", TransitionCondition.CanAddCars);
		t_hd_eCt1.SetNextCondition(LogicConnector.AND, t_hd_eCt2);

		GuardMapping grdt_hd_e = new GuardMapping();
		grdt_hd_e.condition = t_hd_eCt1;
		grdt_hd_e.Activations.add(new Activation(t_hd_e, "i1", TransitionOperation.PopElementWithTargetToQueue, "hd_e"));
		t_hd_e.GuardMappingList.add(grdt_hd_e);

		t_hd_e.Delay = 0;
		pn.Transitions.add(t_hd_e);

		// t_hd_exit----------------------------------------------------------------

		PetriTransition t_hd_exit = new PetriTransition(pn);
		t_hd_exit.TransitionName = "t_hd_exit";
		t_hd_exit.InputPlaceName.add("hd_e");

		Condition t_hd_exitCt1 = new Condition(t_hd_exit, "hd_e", TransitionCondition.HaveCar);

		GuardMapping grdt_hd_exit = new GuardMapping();
		grdt_hd_exit.condition = t_hd_exitCt1;
		grdt_hd_exit.Activations.add(new Activation(t_hd_exit, "hd_e", TransitionOperation.PopElementWithoutTarget, "hd_exit"));
		t_hd_exit.GuardMappingList.add(grdt_hd_exit);

		t_hd_exit.Delay = 0;
		pn.Transitions.add(t_hd_exit);



		// ------------------------ Lane 4 - BT arena A ---------------------------

		// t_bta1 ------------------------------------------------
		PetriTransition t_bta1 = new PetriTransition(pn);
		t_bta1.TransitionName = "t_bta1";
		t_bta1.InputPlaceName.add("i2");
		t_bta1.InputPlaceName.add("bta_in");

		Condition t_bta1Ct1 = new Condition(t_bta1, "i2", TransitionCondition.HaveCarForMe);
		Condition t_bta1Ct2 = new Condition(t_bta1, "bta_in", TransitionCondition.CanAddCars);
		t_bta1Ct1.SetNextCondition(LogicConnector.AND, t_bta1Ct2);

		GuardMapping grdt_bta1 = new GuardMapping();
		grdt_bta1.condition = t_bta1Ct1;
		grdt_bta1.Activations.add(new Activation(t_bta1, "i2", TransitionOperation.PopElementWithTargetToQueue, "bta_in"));
		t_bta1.GuardMappingList.add(grdt_bta1);

		Condition t_bta1Ct3 = new Condition(t_bta1, "i2", TransitionCondition.NotNull);
		Condition t_bta1Ct4 = new Condition(t_bta1, "bta_in", TransitionCondition.CanNotAddCars);
		t_bta1Ct3.SetNextCondition(LogicConnector.AND, t_bta1Ct4);

		GuardMapping grdt_bta_op = new GuardMapping();
		grdt_bta_op.condition = t_bta1Ct3;
		grdt_bta_op.Activations.add(new Activation(t_bta1, "full", TransitionOperation.SendOverNetwork, "OP14"));
		grdt_bta_op.Activations.add(new Activation(t_bta1, "i2", TransitionOperation.Copy, "i2"));
		t_bta1.GuardMappingList.add(grdt_bta1);

		t_bta1.Delay = 0;
		pn.Transitions.add(t_bta1);

		// t_bta_in ------------------------------------------------
		PetriTransition t_bta_in = new PetriTransition(pn);
		t_bta_in.TransitionName = "t_bta_in";
		t_bta_in.InputPlaceName.add("bta_in");
		t_bta_in.InputPlaceName.add("bta_s");

		Condition t_bta_inCt1 = new Condition(t_bta_in, "bta_s", TransitionCondition.Equal, "green");
		Condition t_bta_inCt2 = new Condition(t_bta_in, "bta_in", TransitionCondition.HaveCar);
		t_bta_inCt1.SetNextCondition(LogicConnector.AND, t_bta_inCt2);

		GuardMapping grdt_bta_in = new GuardMapping();
		grdt_bta_in.condition = t_bta_inCt1;
		grdt_bta_in.Activations.add(new Activation(t_bta_in, "bta_in", TransitionOperation.PopElementWithoutTarget, "bta2"));
		grdt_bta_in.Activations.add(new Activation(t_bta_in, "bta_s", TransitionOperation.Move, "bta_s"));

		t_bta_in.GuardMappingList.add(grdt_bta_in);

//		t_bta_in.Delay = 3;
		pn.Transitions.add(t_bta_in);

		// t_bta2 ------------------------------------------------
		PetriTransition t_bta2 = new PetriTransition(pn);
		t_bta2.TransitionName = "t_bta2";
		t_bta2.InputPlaceName.add("bta2");
		t_bta2.InputPlaceName.add("i1");

		Condition t_bta2Ct1 = new Condition(t_bta2, "bta2", TransitionCondition.NotNull);
		Condition t_bta2Ct2 = new Condition(t_bta2, "i1", TransitionCondition.CanAddCars);
		t_bta2Ct1.SetNextCondition(LogicConnector.AND, t_bta2Ct2);

		GuardMapping grdt_bta2 = new GuardMapping();
		grdt_bta2.condition = t_bta2Ct1;
		grdt_bta2.Activations.add(new Activation(t_bta2, "bta2", TransitionOperation.AddElement, "i1"));
		t_bta2.GuardMappingList.add(grdt_bta2);

		t_bta2.Delay = 0;
		pn.Transitions.add(t_bta2);


		// -----------------------------------------------------------------------------
		// --------------------------------Intersection 2-------------------------------
		// -----------------------------------------------------------------------------

		// ------------------------ Lane 1 - Aleea Stadionului ---------------------------

		// t_as1 ------------------------------------------------
		PetriTransition t_as1 = new PetriTransition(pn);
		t_as1.TransitionName = "t_as1";
		t_as1.InputPlaceName.add("as1");
		t_as1.InputPlaceName.add("as_in");

		Condition t_as1Ct1 = new Condition(t_as1, "as1", TransitionCondition.NotNull);
		Condition t_as1Ct2 = new Condition(t_as1, "as_in", TransitionCondition.CanAddCars);
		t_as1Ct1.SetNextCondition(LogicConnector.AND, t_as1Ct2);

		GuardMapping grdt_as1 = new GuardMapping();
		grdt_as1.condition = t_as1Ct1;
		grdt_as1.Activations.add(new Activation(t_as1, "as1", TransitionOperation.AddElement, "as_in"));
		t_as1.GuardMappingList.add(grdt_as1);

		Condition t_as1Ct3 = new Condition(t_as1, "as1", TransitionCondition.NotNull);
		Condition t_as1Ct4 = new Condition(t_as1, "as_in", TransitionCondition.CanNotAddCars);
		t_as1Ct3.SetNextCondition(LogicConnector.AND, t_as1Ct4);

		GuardMapping grdt_as_op = new GuardMapping();
		grdt_as_op.condition = t_as1Ct3;
		grdt_as_op.Activations.add(new Activation(t_as1, "full", TransitionOperation.SendOverNetwork, "OP21"));
		grdt_as_op.Activations.add(new Activation(t_as1, "as1", TransitionOperation.Copy, "as1"));
		t_as1.GuardMappingList.add(grdt_as1);

		t_as1.Delay = 0;
		pn.Transitions.add(t_as1);

		// t_as_in ------------------------------------------------
		PetriTransition t_as_in = new PetriTransition(pn);
		t_as_in.TransitionName = "t_as_in";
		t_as_in.InputPlaceName.add("as_in");
		t_as_in.InputPlaceName.add("as_s");

		Condition t_as_inCt1 = new Condition(t_as_in, "as_s", TransitionCondition.Equal, "green");
		Condition t_as_inCt2 = new Condition(t_as_in, "as_in", TransitionCondition.HaveCar);
		t_as_inCt1.SetNextCondition(LogicConnector.AND, t_as_inCt2);

		GuardMapping grdt_as_in = new GuardMapping();
		grdt_as_in.condition = t_as_inCt1;
		grdt_as_in.Activations.add(new Activation(t_as_in, "as_in", TransitionOperation.PopElementWithoutTarget, "as2"));
		grdt_as_in.Activations.add(new Activation(t_as_in, "as_s", TransitionOperation.Move, "as_s"));

		t_as_in.GuardMappingList.add(grdt_as_in);

//		t_as_in.Delay = 3;
		pn.Transitions.add(t_as_in);

		// t_as2 ------------------------------------------------
		PetriTransition t_as2 = new PetriTransition(pn);
		t_as2.TransitionName = "t_as2";
		t_as2.InputPlaceName.add("as2");
		t_as2.InputPlaceName.add("i2");

		Condition t_as2Ct1 = new Condition(t_as2, "as2", TransitionCondition.NotNull);
		Condition t_as2Ct2 = new Condition(t_as2, "i2", TransitionCondition.CanAddCars);
		t_as2Ct1.SetNextCondition(LogicConnector.AND, t_as2Ct2);

		GuardMapping grdt_as2 = new GuardMapping();
		grdt_as2.condition = t_as2Ct1;
		grdt_as2.Activations.add(new Activation(t_as2, "as2", TransitionOperation.AddElement, "i2"));
		t_as2.GuardMappingList.add(grdt_as2);

		t_as2.Delay = 0;
		pn.Transitions.add(t_as2);

		// ------------------------ Lane 1 exit - Aleea Stadionului-------------------------

		// t_as_e-----------------------------------------------------------
		PetriTransition t_as_e = new PetriTransition(pn);
		t_as_e.TransitionName = "t_as_e";
		t_as_e.InputPlaceName.add("i2");
		t_as_e.InputPlaceName.add("as_e");

		Condition t_as_eCt1 = new Condition(t_as_e, "i2", TransitionCondition.HaveCarForMe);
		Condition t_as_eCt2 = new Condition(t_as_e, "as_e", TransitionCondition.CanAddCars);
		t_as_eCt1.SetNextCondition(LogicConnector.AND, t_as_eCt2);

		GuardMapping grdt_as_e = new GuardMapping();
		grdt_as_e.condition = t_as_eCt1;
		grdt_as_e.Activations.add(new Activation(t_as_e, "i2", TransitionOperation.PopElementWithTargetToQueue, "as_e"));
		t_as_e.GuardMappingList.add(grdt_as_e);

		t_as_e.Delay = 0;
		pn.Transitions.add(t_as_e);

		// t_as_exit----------------------------------------------------------------

		PetriTransition t_as_exit = new PetriTransition(pn);
		t_as_exit.TransitionName = "t_as_exit";
		t_as_exit.InputPlaceName.add("as_e");

		Condition t_as_exitCt1 = new Condition(t_as_exit, "as_e", TransitionCondition.HaveCar);

		GuardMapping grdt_as_exit = new GuardMapping();
		grdt_as_exit.condition = t_as_exitCt1;
		grdt_as_exit.Activations.add(new Activation(t_as_exit, "as_e", TransitionOperation.PopElementWithoutTarget, "as_exit"));
		t_as_exit.GuardMappingList.add(grdt_as_exit);

		t_as_exit.Delay = 0;
		pn.Transitions.add(t_as_exit);


		// ------------------------ Lane 2 - Uzinei Electrice ---------------------------

		// t_ue1 ------------------------------------------------
		PetriTransition t_ue1 = new PetriTransition(pn);
		t_ue1.TransitionName = "t_ue1";
		t_ue1.InputPlaceName.add("ue1");
		t_ue1.InputPlaceName.add("ue_in");

		Condition t_ue1Ct1 = new Condition(t_ue1, "ue1", TransitionCondition.NotNull);
		Condition t_ue1Ct2 = new Condition(t_ue1, "ue_in", TransitionCondition.CanAddCars);
		t_ue1Ct1.SetNextCondition(LogicConnector.AND, t_ue1Ct2);

		GuardMapping grdt_ue1 = new GuardMapping();
		grdt_ue1.condition = t_ue1Ct1;
		grdt_ue1.Activations.add(new Activation(t_ue1, "ue1", TransitionOperation.AddElement, "ue_in"));
		t_ue1.GuardMappingList.add(grdt_ue1);

		Condition t_ue1Ct3 = new Condition(t_ue1, "ue1", TransitionCondition.NotNull);
		Condition t_ue1Ct4 = new Condition(t_ue1, "ue_in", TransitionCondition.CanNotAddCars);
		t_ue1Ct3.SetNextCondition(LogicConnector.AND, t_ue1Ct4);

		GuardMapping grdt_ue_op = new GuardMapping();
		grdt_ue_op.condition = t_ue1Ct3;
		grdt_ue_op.Activations.add(new Activation(t_ue1, "full", TransitionOperation.SendOverNetwork, "OP22"));
		grdt_ue_op.Activations.add(new Activation(t_ue1, "ue1", TransitionOperation.Copy, "ue1"));
		t_ue1.GuardMappingList.add(grdt_ue1);

		t_ue1.Delay = 0;
		pn.Transitions.add(t_ue1);

		// t_ue_in ------------------------------------------------
		PetriTransition t_ue_in = new PetriTransition(pn);
		t_ue_in.TransitionName = "t_ue_in";
		t_ue_in.InputPlaceName.add("ue_in");
		t_ue_in.InputPlaceName.add("ue_s");

		Condition t_ue_inCt1 = new Condition(t_ue_in, "ue_s", TransitionCondition.Equal, "green");
		Condition t_ue_inCt2 = new Condition(t_ue_in, "ue_in", TransitionCondition.HaveCar);
		t_ue_inCt1.SetNextCondition(LogicConnector.AND, t_ue_inCt2);

		GuardMapping grdt_ue_in = new GuardMapping();
		grdt_ue_in.condition = t_ue_inCt1;
		grdt_ue_in.Activations.add(new Activation(t_ue_in, "ue_in", TransitionOperation.PopElementWithoutTarget, "ue2"));
		grdt_ue_in.Activations.add(new Activation(t_ue_in, "ue_s", TransitionOperation.Move, "ue_s"));

		t_ue_in.GuardMappingList.add(grdt_ue_in);

//		t_ue_in.Delay = 3;
		pn.Transitions.add(t_ue_in);

		// t_ue2 ------------------------------------------------
		PetriTransition t_ue2 = new PetriTransition(pn);
		t_ue2.TransitionName = "t_ue2";
		t_ue2.InputPlaceName.add("ue2");
		t_ue2.InputPlaceName.add("i2");

		Condition t_ue2Ct1 = new Condition(t_ue2, "ue2", TransitionCondition.NotNull);
		Condition t_ue2Ct2 = new Condition(t_ue2, "i2", TransitionCondition.CanAddCars);
		t_ue2Ct1.SetNextCondition(LogicConnector.AND, t_ue2Ct2);

		GuardMapping grdt_ue2 = new GuardMapping();
		grdt_ue2.condition = t_ue2Ct1;
		grdt_ue2.Activations.add(new Activation(t_ue2, "ue2", TransitionOperation.AddElement, "i2"));
		t_ue2.GuardMappingList.add(grdt_ue2);

		t_ue2.Delay = 0;
		pn.Transitions.add(t_ue2);

		// ------------------------ Lane 2 exit - Uzinei Electrice-------------------------

		// t_ue_e-----------------------------------------------------------
		PetriTransition t_ue_e = new PetriTransition(pn);
		t_ue_e.TransitionName = "t_ue_e";
		t_ue_e.InputPlaceName.add("i2");
		t_ue_e.InputPlaceName.add("ue_e");

		Condition t_ue_eCt1 = new Condition(t_ue_e, "i2", TransitionCondition.HaveCarForMe);
		Condition t_ue_eCt2 = new Condition(t_ue_e, "ue_e", TransitionCondition.CanAddCars);
		t_ue_eCt1.SetNextCondition(LogicConnector.AND, t_ue_eCt2);

		GuardMapping grdt_ue_e = new GuardMapping();
		grdt_ue_e.condition = t_ue_eCt1;
		grdt_ue_e.Activations.add(new Activation(t_ue_e, "i2", TransitionOperation.PopElementWithTargetToQueue, "ue_e"));
		t_ue_e.GuardMappingList.add(grdt_ue_e);

		t_ue_e.Delay = 0;
		pn.Transitions.add(t_ue_e);

		// t_ue_exit----------------------------------------------------------------

		PetriTransition t_ue_exit = new PetriTransition(pn);
		t_ue_exit.TransitionName = "t_ue_exit";
		t_ue_exit.InputPlaceName.add("ue_e");

		Condition t_ue_exitCt1 = new Condition(t_ue_exit, "ue_e", TransitionCondition.HaveCar);

		GuardMapping grdt_ue_exit = new GuardMapping();
		grdt_ue_exit.condition = t_ue_exitCt1;
		grdt_ue_exit.Activations.add(new Activation(t_ue_exit, "ue_e", TransitionOperation.PopElementWithoutTarget, "ue_exit"));
		t_ue_exit.GuardMappingList.add(grdt_ue_exit);

		t_ue_exit.Delay = 0;
		pn.Transitions.add(t_ue_exit);


		// ------------------------ Lane 3 - BT arena B ---------------------------

		// t_btb1 ------------------------------------------------
		PetriTransition t_btb1 = new PetriTransition(pn);
		t_btb1.TransitionName = "t_btb1";
		t_btb1.InputPlaceName.add("i1");
		t_btb1.InputPlaceName.add("btb_in");

		Condition t_btb1Ct1 = new Condition(t_btb1, "i1", TransitionCondition.HaveCarForMe);
		Condition t_btb1Ct2 = new Condition(t_btb1, "btb_in", TransitionCondition.CanAddCars);
		t_btb1Ct1.SetNextCondition(LogicConnector.AND, t_btb1Ct2);

		GuardMapping grdt_btb1 = new GuardMapping();
		grdt_btb1.condition = t_btb1Ct1;
		grdt_btb1.Activations.add(new Activation(t_btb1, "i1", TransitionOperation.PopElementWithTargetToQueue, "btb_in"));
		t_btb1.GuardMappingList.add(grdt_btb1);

		Condition t_btb1Ct3 = new Condition(t_btb1, "i1", TransitionCondition.NotNull);
		Condition t_btb1Ct4 = new Condition(t_btb1, "btb_in", TransitionCondition.CanNotAddCars);
		t_btb1Ct3.SetNextCondition(LogicConnector.AND, t_btb1Ct4);

		GuardMapping grdt_btb_op = new GuardMapping();
		grdt_btb_op.condition = t_btb1Ct3;
		grdt_btb_op.Activations.add(new Activation(t_btb1, "full", TransitionOperation.SendOverNetwork, "OP23"));
		grdt_btb_op.Activations.add(new Activation(t_btb1, "i1", TransitionOperation.Copy, "i1"));
		t_btb1.GuardMappingList.add(grdt_btb1);

		t_btb1.Delay = 0;
		pn.Transitions.add(t_btb1);

		// t_btb_in ------------------------------------------------
		PetriTransition t_btb_in = new PetriTransition(pn);
		t_btb_in.TransitionName = "t_btb_in";
		t_btb_in.InputPlaceName.add("btb_in");
		t_btb_in.InputPlaceName.add("btb_s");

		Condition t_btb_inCt1 = new Condition(t_btb_in, "btb_s", TransitionCondition.Equal, "green");
		Condition t_btb_inCt2 = new Condition(t_btb_in, "btb_in", TransitionCondition.HaveCar);
		t_btb_inCt1.SetNextCondition(LogicConnector.AND, t_btb_inCt2);

		GuardMapping grdt_btb_in = new GuardMapping();
		grdt_btb_in.condition = t_btb_inCt1;
		grdt_btb_in.Activations.add(new Activation(t_btb_in, "btb_in", TransitionOperation.PopElementWithoutTarget, "btb2"));
		grdt_btb_in.Activations.add(new Activation(t_btb_in, "btb_s", TransitionOperation.Move, "btb_s"));

		t_btb_in.GuardMappingList.add(grdt_btb_in);

//		t_btb_in.Delay = 3;
		pn.Transitions.add(t_btb_in);

		// t_btb2 ------------------------------------------------
		PetriTransition t_btb2 = new PetriTransition(pn);
		t_btb2.TransitionName = "t_btb2";
		t_btb2.InputPlaceName.add("btb2");
		t_btb2.InputPlaceName.add("i2");

		Condition t_btb2Ct1 = new Condition(t_btb2, "btb2", TransitionCondition.NotNull);
		Condition t_btb2Ct2 = new Condition(t_btb2, "i2", TransitionCondition.CanAddCars);
		t_btb2Ct1.SetNextCondition(LogicConnector.AND, t_btb2Ct2);

		GuardMapping grdt_btb2 = new GuardMapping();
		grdt_btb2.condition = t_btb2Ct1;
		grdt_btb2.Activations.add(new Activation(t_btb2, "btb2", TransitionOperation.AddElement, "i2"));
		t_btb2.GuardMappingList.add(grdt_btb2);

		t_btb2.Delay = 0;
		pn.Transitions.add(t_btb2);


		// -------------------------------------------------------------------------------------
		// ----------------------------PNStart-------------------------------------------------
		// -------------------------------------------------------------------------------------

		System.out.println("Exp1 started \n ------------------------------");
		pn.Delay = 2000;
		// pn.Start();

		PetriNetWindow frame = new PetriNetWindow(false);
		frame.petriNet = pn;
		frame.setVisible(true);
	}
}

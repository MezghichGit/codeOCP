package LesInterfacesFonctionneles;

import java.io.Serializable;

@FunctionalInterface
public interface Prediction {
	
	public abstract void info();
	
	public default void add() {}

}

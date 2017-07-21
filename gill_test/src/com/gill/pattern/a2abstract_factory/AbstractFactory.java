package com.gill.pattern.a2abstract_factory;

public abstract class AbstractFactory {
	abstract Color getColor(String color);
	abstract Shape getShape(String shapeType);
}

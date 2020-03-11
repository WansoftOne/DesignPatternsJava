package com.wansoft.design.pattern.creational.prototype.advanced;

import com.wansoft.design.pattern.creational.prototype.advanced.impl.PriceListImpl;
import com.wansoft.design.pattern.creational.prototype.advanced.impl.ProductItem;
import com.wansoft.design.pattern.creational.prototype.advanced.impl.PrototypeFactory;

/**
 * Para comprender mejor cómo funciona este patrón de diseño, hablaremos de un escenario muy común en las empresas. 
 * Sin duda, todos sabemos que las empresas que venden productos o servicios tiene un catálogo de los productos que ofrecen, 
 * estos productos tiene un precio asociado que por lo general es fijo, sin embargo, 
 * existen los escenarios en los que contamos con clientes mayoristas o clientes VIP a los cuales siempre les manejamos un precio especial; 
 * por lo cual, tenemos la necesidad de manejar un listado de precios distinto para estos clientes, 
 * pero ¿qué pasaría si nuestro listado de productos es muy grande y capturar un listado nuevo hace perder mucho tiempo?.
 * 
 * Lo que necesitamos es crear un listado de precios a partir de uno ya existente, el cual tenga los precios estándares y 
 * sobre éste crear otros con un descuento adicional.
 * 
 * SOLUCION:
 * Para poder dar una solución práctica a este escenario, podemos utilizar el patrón de diseño Prototype, 
 * con el objetivo de utilizar el listado de precio estándar para crear dos nuevas listas de precios; 
 * crearemos la lista de precios para clientes de mayoreo, dándoles un 10% de descuento sobre el listado original, 
 * seguido, crearemos un nuevo listado de precios para clientes VIP el cual tendrá un 10% de descuento 
 * adicional sobre el listado de clientes de mayoreo; para lo cual, el listado de mayoreo también lo utilizaremos como prototipo. 
 * En la siguiente imagen podemos apreciar mejor lo explicado:
 * 
 * @author Juan Salinas Zavaleta
 *
 */
public class PrototypeMain {
	
	public static void main(String[] args) {
		/**
		 * Creamos la lista de precios inicial, esta tiene los productos con el precio de lista
		 */
		PriceListImpl standarPriceList = new PriceListImpl("Standar Price List");
		for(int c = 1 ; c <= 5; c++) {
			ProductItem item = new ProductItem("Product"+c , c*2);
			standarPriceList.addProductItem(item);
		}
		PrototypeFactory.addPrototype(
				standarPriceList.getListName(), standarPriceList);
		/**
		 * Segunda lista para clientes de mayoreo a partir de la lista estandar con un
		 * 10% de descuento sobre la lista de precio estandar
		 */
		PriceListImpl wholesalePriceList = (PriceListImpl) 
				PrototypeFactory.getPrototype(standarPriceList.getListName()).deepClone();
		wholesalePriceList.setListName("Wholesale Price List");
		for(ProductItem item : wholesalePriceList.getProducts()) {
			item.setPrice(item.getPrice()*0.90);
		}
		
		PrototypeFactory.addPrototype(
				wholesalePriceList.getListName(), wholesalePriceList);
		
		/**
		 * Tercera lista de precios para clientes VIP a partir de la lista de mayoreo
		 * con 10% de descuento sobre la lista de precios de mayoreo
		 */
		PriceListImpl vipPriceList = (PriceListImpl)
				PrototypeFactory.getPrototype(wholesalePriceList.getListName()).deepClone();
		vipPriceList.setListName("VIP Price List");
		for(ProductItem item : vipPriceList.getProducts()) {
			item.setPrice(item.getPrice() * 0.90);
		}
		
		System.out.println(standarPriceList);
		System.out.println(wholesalePriceList);
		System.out.println(vipPriceList);
	}
}

package net.cloudcentrik.hbs.client.customer;

import java.awt.EventQueue;

/**
 * Main class.
 *
 */
public class Main {

	public static void main(String[] args) {
		System.out.println("hbs client customer module");
		EventQueue.invokeLater(new Runnable() {

			public void run() {
				try {
					new LoginView();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}
}

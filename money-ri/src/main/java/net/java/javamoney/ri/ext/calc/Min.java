/*
 *  Copyright (c) 2012, 2013, Werner Keil, Credit Suisse (Anatole Tresch).
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 * Contributors:
 *    Anatole Tresch - initial version.
 */
package net.java.javamoney.ri.ext.calc;

import javax.money.MonetaryAmount;
import javax.money.ext.annot.ManagedCalculation;

/**
 * Calculation that evaluates the minimum of a number of {@link MonetaryAmount}
 * instances.
 * 
 * @author Anatole Tresch
 */
@ManagedCalculation
public class Min extends AbstractCalculation<MonetaryAmount> {

	public Min() {
		super("min", MonetaryAmount.class, true);
	}

	protected MonetaryAmount calculateImpl(MonetaryAmount... amounts) {
		MonetaryAmount min = amounts[0];
		for (int i = 1; i < amounts.length; i++) {
			if (amounts[i].lessThan(min)) {
				min = amounts[i];
			}
		}
		return min;
	}

}

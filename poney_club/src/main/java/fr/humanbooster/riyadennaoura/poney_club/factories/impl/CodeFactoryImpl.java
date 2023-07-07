package fr.humanbooster.riyadennaoura.poney_club.factories.impl;

import fr.humanbooster.riyadennaoura.poney_club.business.Code;
import fr.humanbooster.riyadennaoura.poney_club.factories.CodeFactory;

public class CodeFactoryImpl implements CodeFactory {
	private static int codeCounter = 0;
	private static CodeFactory codeFactory;

	protected CodeFactoryImpl() {
	}

	public static CodeFactory getInstance() {
		if (codeFactory == null) {
			codeFactory = new CodeFactoryImpl();
		}
		return codeFactory;
	}

	@Override
	public Code fabriquerCode() {
		codeCounter++;
		if (codeCounter < 10) {
			return new Code("STAGE" + "0" + codeCounter);
		} else {
			return new Code("STAGE" + codeCounter);
		}
	}
}

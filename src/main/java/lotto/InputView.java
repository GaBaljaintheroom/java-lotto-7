package lotto;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    private final InputValidator inputValidator = new InputValidator();

    public Cash inputPurchasePrice() {
        System.out.println("구입금액을 입력해 주세요.");

        String price = Console.readLine();

        inputValidator.validateNumeric(price);

        return Cash.from(Converter.parseInt(price));
    }

    public Lotto inputNumbers() {
        System.out.println("당첨 번호를 입력해 주세요.");

        String numbers = Console.readLine();

        inputValidator.validateNumbersByComma(numbers);

        return Lotto.from(Converter.splitComma(numbers));
    }

    public BonusNumber inputNumber(Lotto lotto) {
        System.out.println("보너스 번호를 입력해 주세요.");

        String number = Console.readLine();

        inputValidator.validateNumeric(number);

        int bonusNumber = Converter.parseInt(number);
        lotto.validateDuplicateByBonusNumber(bonusNumber);

        return new BonusNumber(bonusNumber);
    }
}

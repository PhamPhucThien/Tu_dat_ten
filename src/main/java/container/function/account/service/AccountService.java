package container.function.account.service;

import container.data.entity.Account;

import java.util.List;
import java.util.Optional;

public interface AccountService {
    List<Account> getAllAccount();

    Optional<Account> getAccountById(Integer Id);
}

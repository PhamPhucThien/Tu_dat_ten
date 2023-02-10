package container.function.account.service.impl;

import container.data.entity.Account;
import container.data.repository.AccountRepository;
import container.function.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountRepository accountRepository;
    @Override
    public List<Account> getAllAccount() {
        return accountRepository.findAll();
    }
    @Override
    public Optional<Account> getAccountById(Integer Id) { return accountRepository.findById(Id); }

}

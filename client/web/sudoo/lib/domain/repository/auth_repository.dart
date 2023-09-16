import 'package:sudoo/domain/core/data_state.dart';
import 'package:sudoo/domain/model/auth/account.dart';

abstract class AuthRepository {
  Future<DataState<void, Exception>> signIn(Account account);
  Future<DataState<void, Exception>> signUp(Account account);
  Future<DataState<void, Exception>> changePassword(String oldPassword, String newPassword);
  Future<DataState<void, Exception>> logout();
}
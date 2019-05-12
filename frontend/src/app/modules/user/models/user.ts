
export class User {
  id: number;
  username: string;
  password: string;
  role: string;
  name: string;
  surname: string;
  address: string;
  phoneNumber: string;


  constructor(id: number, username: string, password: string, role: string, name: string, surname: string, address: string, phoneNumber: string) {
    this.id = id;
    this.username = username;
    this.password = password;
    this.role = role;
    this.name = name;
    this.surname = surname;
    this.address = address;
    this.phoneNumber = phoneNumber;
  }
}

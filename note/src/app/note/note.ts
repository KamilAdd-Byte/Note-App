export class Note {
  id: string;
  subject: string;
  author: string;

  constructor(id: string, subject: string, author: string) {
    this.id = id;
    this.subject = subject;
    this.author = author;
  }
}

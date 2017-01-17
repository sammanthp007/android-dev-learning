{
        String line_output;
        line_output = "|";
        for (int line_number=1; line_number < 2 * size - 1; line_number++)
        {
            line_output = "";
            int number_of_space = Math.abs(line_number - size);
            line_output = line_output + ' ' * number_of_space;

            // half: 0 = middle, 1= upper, -1 = lower
            int half;
            if (line_number - size > 0)
            {
                half = -1;
            }
            else if (line_number - size < 0)
            {
                half = 1;
            }
            else
            {
                half = 0;
            }

            // add the slashes
            if (half == 1)
            {
                line_output = line_output + "/";
            }
            else if (half == -1)
            {
                line_output = line_output + "\\";
            }
            else
            {
                line_output = line_output + "<";
            }

            String middle_character;
            if (line_number % 2 == 0)
            {
                middle_character = "-";
            }
            else
            {
                middle_character = "=";
            }
            String repeated_middle = new String (new char[2 * line_number - 2]).replace("\0",middle_character);
            line_output = line_output + repeated_middle;
        }
    }
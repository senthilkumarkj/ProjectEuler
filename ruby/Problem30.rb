#!/usr/bin/ruby
max = 999999
i=10
result = 0
while(i<=max)
	sum = 0
	i.to_s.chars.to_a.each{|d| sum = sum + (d.to_i ** 5)}
	if sum == i
		result = result + i
		puts i.to_s
	end
	i = i + 1
end

puts "sum of numbers = "+result.to_s